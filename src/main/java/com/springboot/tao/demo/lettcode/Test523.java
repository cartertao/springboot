package com.springboot.tao.demo.lettcode;

import com.springboot.tao.demo.jdk.clone.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author: carter
 * @Date: 2021/6/2
 * 下面算法会超时，应使用：同余定理
 */
public class Test523 {
    public boolean checkSubarraySum(int[] nums, int k) {
        // 特殊值判断
        if(nums.length <= 1){
            return false;
        }
        if( k == 0){
            long count = Arrays.stream(nums).filter(x -> x == 0).count();
            if(count >= 2){
                return true;
            }
            return false;
        }else if( k == 1 || k == -1){
            return true;
        }

        /**
         * 保存一个倒三角数组
         * 1 3 6 10 15
         * 2 5 9 14
         * ...
         * 可以通过上一个数组推出下一个数组
         */
        long[][] arr = new long[nums.length][];
        long[] arr0 = new long[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if( i == 0) {
                arr0[i] = nums[i];
            } else {
                arr0[i] = arr0[i - 1] + nums[i];
            }
            if( arr0[i] % k == 0 && i > 0)
                return true;
        }
        arr[0] = arr0;

        for (int m = 0; m < arr.length - 1; m++) {
            // 通过第一个来获取下一个数组，减少求和运算
            long [] arrSon = arr[m];

            for (int i = 0; i < arrSon.length; i++) {
                long [] nextArrSon = new long[arrSon.length - 1];
                for (int j = 0; j < nextArrSon.length; j++) {
                    if (j == 0) {
                        nextArrSon[j] = nums[m + 1];
                    } else {
                        nextArrSon[j] = arrSon[j + 1] - arrSon[0];
                    }
                    if( nextArrSon[j] % k == 0 && j > 0)
                        return true;
                }
                arr[m + 1] = nextArrSon;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Test523 test523 = new Test523();
        int [] arr = {5,0,0,0,0};
//        {1,3,6,10,15}
        System.out.println(test523.checkSubarraySum(arr, 3));

        ConcurrentHashMap<String, String> stringStringConcurrentHashMap = new ConcurrentHashMap<>();
        stringStringConcurrentHashMap.put("a","a");
        HashMap<String, String> stringStringHashMap = new HashMap<>();
    }
}
