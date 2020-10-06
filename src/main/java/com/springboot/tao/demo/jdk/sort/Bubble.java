package com.springboot.tao.demo.jdk.sort;

import java.util.Arrays;

/**
 * @author taozhiwei
 * @date 2020/7/20 10:37
 * 冒泡排序 & 选择排序
 */
public class Bubble {

    public static void main(String[] args) {
        test1();
    }

    /**
     * 冒泡排序
     * 两个相邻的元素直接比较大小(符合条件则相邻两个替换位置)
     */
    public static void test1(){
        String refundOrderNo = "20092917261881C1";
        String seq = refundOrderNo.substring(refundOrderNo.indexOf('C') + 1);
        System.out.println(seq);
        int[] arr = {4,5,6,3,2,1};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    /**
     * 选择排序
     * 每一轮要选择几个最大或者最小值，每轮只需要交换元素位置1次
     */
    public static void test2(){
        int[] arr = {4,5,6,3,2,1};
        int index;
        for (int i = 0; i < arr.length - 1; i++) {
            index = 0;
            for (int j = 1; j < arr.length - i; j++) {
                if(arr[j] > arr[index]){
                    index = j;
                }
            }
            int temp = arr[arr.length - i -1];
            arr[arr.length - i -1] = arr[index];
            arr[index] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }

}
