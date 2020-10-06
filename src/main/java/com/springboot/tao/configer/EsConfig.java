package com.springboot.tao.configer;

import org.apache.http.HttpHost;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.apache.http.impl.nio.client.HttpAsyncClientBuilder;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestClientBuilder;
import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * @author taozhiwei
 * @date 2020/9/1 10:40
 */
@Configuration
public class EsConfig {
    @Value("${elasticsearch.host}")
    private String host;

    @Value("${elasticsearch.port}")
    private int port;

    @Value("${elasticsearch.name}")
    private String name;

    @Value("${elasticsearch.password}")
    private String password;

    @Bean(name = "restClientBuilder")
    @Primary
    public RestClientBuilder createClient(){
        //账号密码凭证
        CredentialsProvider credentialsProvider = new BasicCredentialsProvider();
        credentialsProvider.setCredentials(AuthScope.ANY, new UsernamePasswordCredentials(name, password));
        //ip地址
        RestClientBuilder restClientBuilder = RestClient.builder(new HttpHost(host, port));
        //自定义客户端配置
        restClientBuilder.setHttpClientConfigCallback(new RestClientBuilder.HttpClientConfigCallback() {
            @Override
            public HttpAsyncClientBuilder customizeHttpClient(HttpAsyncClientBuilder httpClientBuilder) {
                //注入账号密码
                return httpClientBuilder.setDefaultCredentialsProvider(credentialsProvider);
            }
        });

        return restClientBuilder;

        //Java Low Level REST Client （要想使用高版本client必须依赖低版本的client）
        //RestClient client = restClientBuilder.build();
        //Java High Level REST Client （高版本client）
        //RestHighLevelClient restHighLevelClient = new RestHighLevelClient(client);
    }

    @Bean(name = "highLevelClient")
    public RestHighLevelClient highLevelClient(@Autowired RestClientBuilder restClientBuilder) {
        return new RestHighLevelClient(restClientBuilder);
    }
}
