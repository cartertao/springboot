package com.example.demo.service;


import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.*;
import java.util.*;
import java.util.logging.Filter;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.nio.file.Files.newInputStream;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

public class test1 {

    public static void main(String[] args) throws Exception{
        Path path = Paths.get("C:\\Users\\tj12\\Desktop\\bash");
        Path path1 = Paths.get("C:\\Users\\tj12\\Desktop\\bash\\aa\\cc");

        //列出目录下所有文件名
        try(DirectoryStream<Path> paths = Files.newDirectoryStream(path)){
            for(Path p : paths){
                //System.out.println(p.getFileName()); //文件名
            }
        }catch (Exception e){}
        //正则过滤目录
        try(DirectoryStream<Path> paths = Files.newDirectoryStream(path,"*.{gif,txt}")){
            for(Path p : paths){
                //System.out.println(p.getFileName()); //文件名
            }
        }catch (Exception e){}
        //过滤器过滤非目录
        try(DirectoryStream<Path> paths =Files.newDirectoryStream(path,(Path s)->Files.isDirectory(s))){
            for(Path p : paths){
                System.out.println(p.getFileName()); //文件名
            }
        }
        //创建目录
        //只能在父目录存在的目录下面创建，且目录不存在
        Files.createDirectory(path);
        //无论父目录是否存在都可以创建，如果目录已经存在则不创建
        Files.createDirectories(path1);
    }
}

@FunctionalInterface
interface Ftest{
    String add(String i);
}

class Student{
    private String name;
    private int age;

    public Student(String name,int age){
        this.name=name;
        this.age =age;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "name="+name+"--"+"age"+age;
    }
}
class Dog{
    public static void eat(Integer i){
        System.out.println(i+"static");
    }
    public void sleep(Integer i){
        System.out.println(i+"sleep");
    }
}