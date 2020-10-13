package com.springboot.tao.demo.jdk;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;

/**
 * @author taozhiwei
 * @date 2020/10/9 11:14
 */
public class ClassCloader extends ClassLoader{

    private String mLibPath;

    public ClassCloader(String path) {
        // TODO Auto-generated constructor stub
        mLibPath = path;
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        // TODO Auto-generated method stub

        String fileName = getFileName(name);

        File file = new File(mLibPath,fileName);

        try {
            FileInputStream is = new FileInputStream(file);

            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            int len = 0;
            try {
                while ((len = is.read()) != -1) {
                    bos.write(len);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            byte[] data = bos.toByteArray();
            is.close();
            bos.close();

            return defineClass(name,data,0,data.length);

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return super.findClass(name);
    }

    //获取要加载 的class文件名
    private String getFileName(String name) {
        // TODO Auto-generated method stub
        int index = name.lastIndexOf('.');
        if(index == -1){
            return name+".class";
        }else{
            return name.substring(index+1)+".class";
        }
    }

    public static void main(String[] args) throws Exception{
        ClassCloader classCloader = new ClassCloader("F:\\excel");
        //这个方法会调用findClass("com.tao.text.ClassTest")
        Class<?> clazz = classCloader.loadClass("com.frank.test.Test");
        Method say = clazz.getDeclaredMethod("say", String.class);
        Object o = clazz.newInstance();
        say.invoke(o, "hello world");
    }
}
