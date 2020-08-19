package com.springboot.tao.util;

import com.alibaba.fastjson.JSON;
import com.springboot.tao.bean.HttpResultBean;
import org.apache.http.*;
import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.*;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.config.Registry;
import org.apache.http.config.RegistryBuilder;
import org.apache.http.conn.ConnectTimeoutException;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.conn.socket.ConnectionSocketFactory;
import org.apache.http.conn.socket.LayeredConnectionSocketFactory;
import org.apache.http.conn.socket.PlainConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.UnknownHostException;
import java.util.*;
import java.util.concurrent.TimeUnit;

/**
 * @author taozhiwei
 * @date 2020/7/27 16:59
 */
public class HttpClientTool {
    // org.apache.http.impl.client.CloseableHttpClient
    private static CloseableHttpClient httpclient = null;

    // 这里就直接默认固定了,因为以下三个参数在新建的method中仍然可以重新配置并被覆盖.
    static final int connectionRequestTimeout = 5000;// ms毫秒,从池中获取链接超时时间
    static final int connectTimeout = 5000;// ms毫秒,建立链接超时时间
    static final int socketTimeout = 30000;// ms毫秒,读取超时时间

    // 总配置,主要涉及是以下两个参数,如果要作调整没有用到properties会比较后麻烦,但鉴于一经粘贴,随处可用的特点,就不再做依赖性配置化处理了.
    // 而且这个参数同一家公司基本不会变动.
    static final int maxTotal = 500;// 最大总并发,很重要的参数
    static final int maxPerRoute = 100;// 每路并发,很重要的参数

    // 正常情况这里应该配成MAP或LIST
    // 细化配置参数,用来对每路参数做精细化处理,可以管控各ip的流量,比如默认配置请求baidu:80端口最大100个并发链接,
    static final String detailHostName = "http://www.baidu.com";// 每个细化配置之ip(不重要,在特殊场景很有用)
    static final int detailPort = 80;// 每个细化配置之port(不重要,在特殊场景很有用)
    static final int detailMaxPerRoute = 100;// 每个细化配置之最大并发数(不重要,在特殊场景很有用)

    public static CloseableHttpClient getHttpClient() {
        if (null == httpclient) {
            synchronized (HttpClientTool.class) {
                if (null == httpclient) {
                    httpclient = init();
                }
            }
        }
        return httpclient;
    }

    /**
     * 链接池初始化 这里最重要的一点理解就是. 让CloseableHttpClient 一直活在池的世界里, 但是HttpPost却一直用完就消掉.
     * 这样可以让链接一直保持着.
     *
     * @return
     */
    private static CloseableHttpClient init() {
        CloseableHttpClient newHttpclient = null;

        // 设置连接池
        ConnectionSocketFactory plainsf = PlainConnectionSocketFactory.getSocketFactory();
        LayeredConnectionSocketFactory sslsf = SSLConnectionSocketFactory.getSocketFactory();
        Registry<ConnectionSocketFactory> registry = RegistryBuilder.<ConnectionSocketFactory> create().register("http", plainsf).register("https", sslsf).build();
        PoolingHttpClientConnectionManager cm;
        cm = new PoolingHttpClientConnectionManager(registry);
        // 将最大连接数增加
        cm.setMaxTotal(maxTotal);
        // 将每个路由基础的连接增加
        cm.setDefaultMaxPerRoute(maxPerRoute);

        // 细化配置开始,其实这里用Map或List的for循环来配置每个链接,在特殊场景很有用.
        // 对特定的ip的访问设置参数
        HttpHost httpHost = new HttpHost(detailHostName, detailPort);
        // 将目标主机的最大连接数增加
        cm.setMaxPerRoute(new HttpRoute(httpHost), detailMaxPerRoute);
        // cm.setMaxPerRoute(new HttpRoute(httpHost2),
        // detailMaxPerRoute2);//可以有细化配置2
        // cm.setMaxPerRoute(new HttpRoute(httpHost3),
        // detailMaxPerRoute3);//可以有细化配置3
        // 细化配置结束

        // 请求重试处理
        HttpRequestRetryHandler httpRequestRetryHandler = (exception, executionCount, context) -> {
            if (executionCount >= 2) {// 如果已经重试了2次，就放弃
                return false;
            }
            if (exception instanceof NoHttpResponseException) {// 如果服务器丢掉了连接，那么就重试
                return true;
            }
            if (exception instanceof SSLHandshakeException) {// 不要重试SSL握手异常
                return false;
            }
            if (exception instanceof InterruptedIOException) {// 超时
                return false;
            }
            if (exception instanceof UnknownHostException) {// 目标服务器不可达
                return false;
            }
            if (exception instanceof ConnectTimeoutException) {// 连接被拒绝
                return false;
            }
            if (exception instanceof SSLException) {// SSL握手异常
                return false;
            }

            HttpClientContext clientContext = HttpClientContext.adapt(context);
            HttpRequest request = clientContext.getRequest();
            // 如果请求是幂等的，就再次尝试
            if (!(request instanceof HttpEntityEnclosingRequest)) {
                return true;
            }
            return false;
        };

        // 配置请求的超时设置
        RequestConfig requestConfig = RequestConfig.custom()
                .setConnectionRequestTimeout(connectionRequestTimeout)//连接目标服务器超时时间
                .setConnectTimeout(connectTimeout)//数据库返回数据的超时时间
                .setSocketTimeout(socketTimeout)//从连接池获取连接的超时时间
                .build();
        newHttpclient = HttpClients.custom()
                .setConnectionManager(cm)
                .setConnectionManagerShared(false)//连接池不是共享模式
                .evictIdleConnections(60, TimeUnit.SECONDS)//定期回收空闲链接
                .evictExpiredConnections()//定期回收过期链接
                .setDefaultRequestConfig(requestConfig)
                .setRetryHandler(httpRequestRetryHandler)
                .build();
        return newHttpclient;
    }

    public static HttpResultBean get(String url , Map<String,String> params , Map<String ,String> headers, HttpResultBean result) throws Exception{
        //连接池获取,否则CloseableHttpClient httpClient = HttpClients.createDefault();
        //4.3开始建议CloseableHttpClient httpClient = HttpClientBuilder.create().build();
        CloseableHttpClient httpClient=HttpClientTool.getHttpClient();
        result.setType("get");
        setResult(result,url,params,headers);
        //get传递数据
        URIBuilder getDate= new URIBuilder(url);
        if(params!=null && params.size()>0){
            Set<String> keySet = params.keySet();
            for(String key : keySet){
                getDate.addParameter(key,params.get(key));
            }
        }
        HttpGet get = new HttpGet(getDate.build());
        //设置指定的请求头
        setHeader(get,new HashMap<>());
        CloseableHttpResponse response =null;
        //发送请求
        result = send(get,httpClient ,result);
        return result;
    }

    //post --  form表单提交
    public static HttpResultBean postForm(String url ,Map<String,String> params , Map<String ,String> headers,HttpResultBean result){
        //从连接池获取
        CloseableHttpClient httpClient=HttpClientTool.getHttpClient();
        HttpPost httppost=new HttpPost(url);
        result.setType("postForm");
        setResult(result,url,params,headers);
        //正式环境，发送的数据通过map传递到这个方法，然后遍历保存到对象，在保存到list中
        List<NameValuePair> postData = new ArrayList<NameValuePair>();
        if(params!=null && params.size()>0){
            Set<String> keySet = params.keySet();
            for(String key : keySet){
                postData.add(new BasicNameValuePair(key,params.get(key)));
            }
        }
        UrlEncodedFormEntity uefEntity;
        try {
            uefEntity = new UrlEncodedFormEntity(postData, "UTF-8");
            httppost.setEntity(uefEntity);
            //设置发送数据类型表单form
            httppost.addHeader("Content-Type","application/x-www-form-urlencoded;charset=utf-8");
            setHeader(httppost,new HashMap<>());//自定义其他
            //发送请求
            result = send(httppost,httpClient,result);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    //post  - ajax类型以json字符串形式发送数据
    public static HttpResultBean postJson(String url ,Map<String,String> params , Map<String ,String> headers,HttpResultBean result){
        //从连接池获取
        CloseableHttpClient httpClient = HttpClientTool.getHttpClient();
        HttpPost httpPost = new HttpPost(url);
        result.setType("postForm");
        setResult(result,url,params,headers);
        //设置请求头
        httpPost.setHeader("Content-type","application/json");
        setHeader(httpPost,headers);
        //设置请求数据
        //String json = "{\"student\":\"tao\",\"name\":\"taozhiwei\"}";
        String json = JSON.toJSONString(params);
        StringEntity stringEntity = new StringEntity(json,"utf-8");
        httpPost.setEntity(stringEntity);
        result = send(httpPost,httpClient,result);
        return result;
    }

    //put
    public static HttpResultBean put(String url ,Map<String,String> params , Map<String ,String> headers,HttpResultBean result){
        CloseableHttpClient httpClient = HttpClientTool.getHttpClient();
        HttpPut put = new HttpPut(url);
        result.setType("postForm");
        setResult(result,url,params,headers);
        setHeader(put,headers);//设置header
        put.setHeader("Content-type","application/json");
        //设置参数
        //String json = "{\"student\":\"tao\",\"name\":\"taozhiwei\"}";
        String json = JSON.toJSONString(params);
        StringEntity stringEntity = new StringEntity(json,"utf-8");
        put.setEntity(stringEntity);
        //请求
        result = send(put,httpClient,result);
        return result;
    }

    //delete
    public static HttpResultBean delete(String url, Map<String ,String> headers,HttpResultBean result){
        result.setUrl(url);
        result.setType("delete");
        result.setSendHeader(JSON.toJSONString(headers));

        CloseableHttpClient httpClient = HttpClientTool.getHttpClient();
        HttpDelete delete = new HttpDelete(url);
        setHeader(delete,headers);
        result = send(delete,httpClient,result);
        return result;
    }


    //设置指定的请求头
    //HttpRequestBase 是HttpPost 和 HttpGet HttpPut的父类，这样可以设置两者的header
    public static void setHeader(HttpRequestBase httpPost, Map<String,String> header){
        if(header != null && header.size()>0){
            for(Map.Entry<String,String> entry : header.entrySet()){
                httpPost.setHeader(entry.getKey(),entry.getValue());
            }
        }
    }

    //发送请求并得到结果
    public static HttpResultBean send(HttpRequestBase http , CloseableHttpClient httpClient , HttpResultBean result) {
        String content = null;
        CloseableHttpResponse httpResponse = null;
        try {
            httpResponse = httpClient.execute(http);//发送请求
            HttpEntity entity = httpResponse.getEntity();//得到返回对象
            content = EntityUtils.toString(entity,"utf-8");//解析返回对象得到String
            result.setContent(content);
            Header[] headers = httpResponse.getAllHeaders();//获取返回信息的header
            result.setHeaders(headers);
            int statusCode = httpResponse.getStatusLine().getStatusCode();//返回code 200 500 ...
            result.setStatusCode(statusCode);
            String phrase = httpResponse.getStatusLine().getReasonPhrase();
            result.setPhrase(phrase);
            //httpPost.abort();//中断请求,接下来可以开始另一段请求,所以个人理应,用这个应该可以在session中虚拟登录
            //httpPost.releaseConnection();//释放请求.如果释放了相当于要清空session
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try{
                httpResponse.close();
            }catch (IOException e){
                e.printStackTrace();
            }

        }
        return result;
    }

    //保存请求时候的数据
    public static void setResult(HttpResultBean result, String url , Map<String,String> params, Map<String,String> headers){
        result.setUrl(url);
        result.setData(JSON.toJSONString(params));
        result.setSendHeader(JSON.toJSONString(headers));
    }
}
