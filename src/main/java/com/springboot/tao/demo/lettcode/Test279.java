package com.springboot.tao.demo.lettcode;

import java.util.Arrays;

/**
 * @Author: carter
 * @Date: 2021/6/11
 */
public class Test279 {

    public String longestPalindrome(String s) {
        int start = 0, last = 0;
        int length = s.length();
        char[] chars = s.toCharArray();
        if (length == 1) {
            return s;
        } else if(length == 2) {
            if(chars[0] == chars[1])
                return s;
            else
                return s.substring(0,1);
        }
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {

            }
        }
        return "";
    }

    public static void main(String[] args) {
        // a:97 + 25 122
        String babad = new Test279().longestPalindrome("babad");
        System.out.println(babad);

    }
}
