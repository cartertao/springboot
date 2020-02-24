package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Base64;

@RestController
public class TestController {


    /**
     * 断点上传
     * @param md5 文件的md5
     * @param size 文件总大小
     * @param chunks 总块数
     * @param chunk 第几块 从0开始
     * @param file 文件
     * @throws Exception
     */
    @RequestMapping("/upload")
    public void test(
            String name,
            String md5,
            Long size,
            Integer chunks,
            Integer chunk,
            MultipartFile file
    ) throws Exception {
        if (chunks != null) {
            uploadBlockS(name,md5,size,chunks,chunk,file);
        }
    }

    public void uploadBlockS(String name,String md5,Long size,Integer chunks,Integer chunk,MultipartFile file) throws Exception{
        String fileName = md5 + "_" + "_" + chunks + name + ".tmp";
        long chunkSize = file.getSize();    //当前块的文件大小
        String path = "D:\\mm\\" + fileName;
        if((new File(path.substring(0,path.length()-3))).exists()){
            throw new Exception("文件已存在");
        }

        RandomAccessFile randomAccessFile = new RandomAccessFile(path,"rw");
        randomAccessFile.setLength(size);//此时已经生成文件，且长度为指定值
        if(chunk == chunks){   //最后一块
            randomAccessFile.seek(size - chunkSize);
        }else{
            randomAccessFile.seek((chunk - 1) * chunkSize);
        }

        byte[] buf = new byte[1024];
        int len;
        try(InputStream inputStream = file.getInputStream()){
            while (-1 != (len = inputStream.read(buf))) {
                randomAccessFile.write(buf,0,len);
            }
        }catch (Exception e){
            throw new Exception("写入失败:" + e.getMessage());
        } finally{
            randomAccessFile.close();
        }

        //上传完成重命名
        if(chunk == chunks){
            File file1 = new File(path);
            File file2 = new File(path.substring(0,path.length() - 3));
            file1.renameTo(file2);
        }
    }








    //二进制文件上传并且携带参数
    @RequestMapping("/t1")
    public String t1(HttpServletRequest request,@RequestParam("file") MultipartFile file,@RequestParam("name") String name){
        System.out.println(file.getSize());
        System.out.println(name);
        return request.getParameter("url");
    }

    //base64
    @RequestMapping("/t2")
    public String t2(@RequestParam("base64") String base64) throws IOException {
        Path path = Paths.get("C:\\Users\\tj12\\Desktop\\bash\\m.jpg");
        base64 = base64.replaceAll(" ","+").replace("data:image/jpeg;base64,", "");

        byte[] decode1 = Base64.getDecoder().decode(base64);//解密
        for (int i = 0; i < decode1.length; ++i) {
            if (decode1[i] < 0) {// 调整异常数据
                decode1[i] += 256;
            }
        }
        try(OutputStream outputStream = Files.newOutputStream(path)){
            outputStream.write(decode1);
        }
        return "ok";
    }

    @RequestMapping("/t3")
    public String t3(@RequestParam("file") MultipartFile file){

        return "ok";
    }

}
