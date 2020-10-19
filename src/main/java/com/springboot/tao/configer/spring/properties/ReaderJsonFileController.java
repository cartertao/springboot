package com.springboot.tao.configer.spring.properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * @author taozhiwei
 * @date 2020/10/14 15:22
 */
@RestController
@RequestMapping("/properties")
public class ReaderJsonFileController {

    @Autowired
    public MyConfigurationProperties1 myConfigurationProperties1;
    @Autowired
    public ConfigBean configBean;
    @Autowired
    public MyConfigurationProperties2 myConfigurationProperties2;
    @Autowired
    public MyPropertySource1 myPropertySource1;
    @Autowired
    public MyPropertySource2 myPropertySource2;

    /**
     * 获取json文件，注意没有$和{}还要有classpath
     */
    @Value("classpath:test1.json")
    Resource resource;

    @RequestMapping("/test1")
    public void test(){
        System.out.println(myConfigurationProperties1);  //cglib
        System.out.println(configBean);
        System.out.println(myConfigurationProperties2);
        System.out.println(myPropertySource1);
        System.out.println(myPropertySource2);
    }

    @GetMapping("/json")
    public String getJson() throws IOException {
        String str = "";
        File file = resource.getFile();
        try(BufferedReader bufferedReader = Files.newBufferedReader(Paths.get(file.getPath()), Charset.forName("UTF-8"))){
            String content = null;
            while((content = bufferedReader.readLine()) != null){
                str += content;
            }
        }
        return str;
    }
}
