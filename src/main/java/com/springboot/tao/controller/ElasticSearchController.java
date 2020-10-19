package com.springboot.tao.controller;

import com.alibaba.fastjson.JSON;
import com.springboot.tao.bean.db.Student;
import org.elasticsearch.action.DocWriteRequest;
import org.elasticsearch.action.DocWriteResponse;
import org.elasticsearch.action.bulk.BulkItemResponse;
import org.elasticsearch.action.bulk.BulkRequest;
import org.elasticsearch.action.bulk.BulkResponse;
import org.elasticsearch.action.delete.DeleteRequest;
import org.elasticsearch.action.delete.DeleteResponse;
import org.elasticsearch.action.get.GetRequest;
import org.elasticsearch.action.get.GetResponse;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.action.support.IndicesOptions;
import org.elasticsearch.action.support.WriteRequest;
import org.elasticsearch.action.update.UpdateRequest;
import org.elasticsearch.action.update.UpdateResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.client.core.CountRequest;
import org.elasticsearch.common.unit.Fuzziness;
import org.elasticsearch.common.unit.TimeValue;
import org.elasticsearch.common.xcontent.XContentType;
import org.elasticsearch.index.VersionType;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.script.Script;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.SearchHits;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.elasticsearch.search.sort.FieldSortBuilder;
import org.elasticsearch.search.sort.ScoreSortBuilder;
import org.elasticsearch.search.sort.SortOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.*;
import java.util.concurrent.TimeUnit;

/**
 * @author taozhiwei
 * @date 2020/9/1 11:44
 */
@RestController("/es")
public class ElasticSearchController {
    @Autowired
    private RestHighLevelClient restHighLevelClient;

    @GetMapping("/info")
    public void info() throws IOException {
        //获取索引信息
        CountRequest request = new CountRequest("index2");

    }

    @GetMapping("/insert")
    public void insert() throws IOException {
        //插入数据
        Map<String, Object> jsonMap = new HashMap<>();
        jsonMap.put("user", "laimailai");
        jsonMap.put("postDate", new Date());
        jsonMap.put("message", "trying out Elasticsearch");
        //设置index名和id 如果不设置id则自动生成
        IndexRequest req = new IndexRequest("index").id("88")
                .source(jsonMap);
        //设置路由
        req.routing("rout1");
        //设置超时  2者随便选择一个
        //根据提供的TimeValue选择是秒还是分钟等
        req.timeout(TimeValue.timeValueSeconds(1));
        //根据字符串的单位来设置 s秒 m分钟等
        //req.timeout("1s");

        //刷新数据策略
        req.setRefreshPolicy(WriteRequest.RefreshPolicy.NONE);
        //req.setRefreshPolicy(WriteRequest.RefreshPolicy.IMMEDIATE);
        //req.setRefreshPolicy(WriteRequest.RefreshPolicy.WAIT_UNTIL);

        req.version(2);
        req.versionType(VersionType.EXTERNAL);



        //插入单条数据
        IndexResponse indexResponse1 = restHighLevelClient.index(req, RequestOptions.DEFAULT);

        //插入多条
        Student tao1 = new Student(1, "tao1", 11);
        Student tao2 = new Student(2, "tao2", 22);
        BulkRequest request = new BulkRequest();
        request.add(new IndexRequest("index4").id("4").source(JSON.toJSONString(tao1), XContentType.JSON));
        request.add(new IndexRequest("index5").id("5").source(JSON.toJSONString(tao2), XContentType.JSON));
        request.add(new IndexRequest("index6").id("6").source(XContentType.JSON, "name", "tao", "age", "18"));
        BulkResponse bulkResponse = restHighLevelClient.bulk(request, RequestOptions.DEFAULT);
        //每一条都有一个响应
        for (BulkItemResponse bulkItemResponse : bulkResponse) {
            DocWriteResponse itemResponse = bulkItemResponse.getResponse();

            if (bulkItemResponse.getOpType() == DocWriteRequest.OpType.INDEX
                    || bulkItemResponse.getOpType() == DocWriteRequest.OpType.CREATE) {
                IndexResponse indexResponse = (IndexResponse) itemResponse;
                System.out.println("处理索引操作的响应" + indexResponse);
            } else if (bulkItemResponse.getOpType() == DocWriteRequest.OpType.UPDATE) {
                UpdateResponse updateResponse = (UpdateResponse) itemResponse;
                System.out.println("处理更新操作的响应" + updateResponse);
            } else if (bulkItemResponse.getOpType() == DocWriteRequest.OpType.DELETE) {
                DeleteResponse deleteResponse = (DeleteResponse) itemResponse;
                System.out.println("处理删除操作的响应" + deleteResponse);
            }
            System.out.println(indexResponse1);
        }
    }

    @GetMapping("/select")
    public Map<String, Object> select() throws IOException {
        //读取数据
        GetRequest getData = new GetRequest("index5", "5");
        GetResponse getResponse = restHighLevelClient.get(getData, RequestOptions.DEFAULT);
        return getResponse.getSource();
    }

    @GetMapping("/update")
    public void update() throws IOException {
        //更新数据
        UpdateRequest request = new UpdateRequest("index", "2");
        UpdateResponse updateResponse = restHighLevelClient.update(request, RequestOptions.DEFAULT);
        System.out.println(updateResponse);
    }

    @GetMapping("/delete")
    public void delete() throws IOException {
        //删除
        DeleteRequest request = new DeleteRequest("index", "2");
        DeleteResponse delete = restHighLevelClient.delete(request, RequestOptions.DEFAULT);
        System.out.println(delete);
    }

    @GetMapping("/search")
    public void search(){

        SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();
        //不同的QueryBuilder，只能使用一个，使用多个被替换
        searchSourceBuilder.query(QueryBuilders.matchAllQuery());
        searchSourceBuilder.query(QueryBuilders.termQuery("user", "kimchy"));
        searchSourceBuilder.query(QueryBuilders.boolQuery());
        //QueryBuilder对象也可以使用QueryBuilders实用工具类创建。此类提供了一些辅助方法，可以使用流畅的编程样式来创建QueryBuilder对象：
        searchSourceBuilder.query(QueryBuilders.matchQuery("user", "kimchy")
                .fuzziness(Fuzziness.AUTO)
                .prefixLength(3)
                .maxExpansions(10));

        //默认情况下，搜索请求返回文档_source的内容，但是就像在Rest API中一样，您可以覆盖此行为。例如，您可以完全关闭_source检索：
        //该方法还接受一个或多个通配符模式的数组，以控制以更细粒度的方式包含或排除哪些字段：
        //searchSourceBuilder.fetchSource(false);
        String[] includeFields = new String[] {"title", "innerObject.*"};
        String[] excludeFields = new String[] {"user"};
        searchSourceBuilder.fetchSource(includeFields, excludeFields);

        //SearchSourceBuilder允许添加一个或多个SortBuilder实例。有四个特殊的实现（Field-，Score-，GeoDistance-和ScriptSortBuilder）
        searchSourceBuilder.sort(new ScoreSortBuilder().order(SortOrder.DESC));
        searchSourceBuilder.sort(new FieldSortBuilder("id").order(SortOrder.ASC));
        //页码
        searchSourceBuilder.from(0);
        //每页个数
        searchSourceBuilder.size(5);
        //超时时间
        searchSourceBuilder.timeout(new TimeValue(60, TimeUnit.SECONDS));
        /**
         *SearchRequest
         */
        SearchRequest searchRequest = new SearchRequest();
        //设置索引方式，通过方法或者构造函数
        searchRequest = new SearchRequest("product");
        searchRequest.indices("product");
        //设置路由值
        searchRequest.routing("routing");
        //设置IndicesOptions可以控制如何解决不可用的索引以及如何扩展通配符表达式
        searchRequest.indicesOptions(IndicesOptions.lenientExpandOpen());
        //使用首选项参数，例如执行搜索以偏爱本地分片。默认值是随机分片。
        searchRequest.preference("_local");
        searchRequest.source(searchSourceBuilder);


    }

/*    public void test(){
        SearchSourceBuilder searchSource = new SearchSourceBuilder();

        searchSource.query(QueryBuilders
                .boolQuery()
                .must(QueryBuilders.boolQuery().should(QueryBuilders.termsQuery("prdType", "P", "N")))
                .must(QueryBuilders.termQuery("internalSaleFlag", "N"))
                .must(QueryBuilders.boolQuery().filter(QueryBuilders.scriptQuery(new Script("(doc['saleChannel'].value&1)==1"))))
                .mustNot(QueryBuilders.boolQuery()
                        .must(QueryBuilders.termsQuery("presellFlag", "Y"))
                        .must(QueryBuilders.rangeQuery("presellEnd").lt(InniDateUtil.getDateCN().getTime())))
                .must(QueryBuilders.termsQuery("saleStatus",PrdSaleStatus.IN_SALE.name(),PrdSaleStatus.SOLD_OUT.name()))
                .must(QueryBuilders.multiMatchQuery(keyword, "name", "basicDesc"));
        searchSource.from(1);
        searchSource.size(5);

        SearchRequest request = new SearchRequest();
        request.indices("product");
        request.source(searchSource);
        SearchResponse response = client.search(request, RequestOptions.DEFAULT);

        SearchHits searchHits = response.getHits();

        List<DbProduct> products = new ArrayList<>();
        for (SearchHit hit : searchHits) {
            Map<String, Object> sourceAsMap = hit.getSourceAsMap();
            DbProduct product = JSON.parseObject(JSON.toJSONString(sourceAsMap), DbProduct.class);
            // TO
            products.add(product);
        }
    }*/
}
