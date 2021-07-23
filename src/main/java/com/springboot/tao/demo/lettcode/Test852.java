package com.springboot.tao.demo.lettcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: carter
 * @Date: 2021/6/15
 */
public class Test852 {

    public static void main(String[] args) {
        String res = "abcd";
        char[] ch = res.toCharArray();
        print(ch,0);
    }
    public static void print(char[] ch,int index)
    {
        if(ch==null || index<0)
        {
            System.out.println("输入错误");
            return;
        }
        if(index == ch.length-1) {
            System.out.println(ch);
            System.out.println(Arrays.toString(ch));
        }
        else
        {
            for(int i=index;i<ch.length;i++)
            {
                swap(ch,i,index);

                print(ch,index+1);

                swap(ch,i,index);
            }
        }
    }
    public static void swap(char[] ch,int x,int y)
    {
        char temp = ch[x];
        ch[x] = ch[y];
        ch[y] = temp;
    }
}
