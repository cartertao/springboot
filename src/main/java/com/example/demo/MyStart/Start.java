package com.example.demo.MyStart;

import java.io.File;
import java.io.RandomAccessFile;

public class Start {

    public static void main(String[] args) throws Exception{

        File file1 = new File("D:\\mm\\a.txt");
        File file2 = new File("D:\\mm\\b.txt");
        file1.renameTo(file2);

    }
}





