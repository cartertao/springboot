package com.springboot.tao.demo.jdk.sort;

import java.util.Arrays;

/**
 * @Author: carter
 * @Date: 2021/7/22
 * 希尔排序
 * - 适用于有部分连续数据是符合排序规则的
 * - 如果几乎没有连续排序的片段，不如直接选择排序
 * Hibbard: 1,3,5,7
 * Sedgewick: 1,5,19,41
 */
public class ShellSort {

    public int[] sort(int[] arr, int[] ds) {
        for (int i = 0; i < ds.length; i++) {
            int d = ds[i];
            for (int k = 0; k < d; k++) {
                for (int j = 0; j < arr.length; j++) {
                    int index = k + j * d;
                    int next = index + d;
                    if ( index >= arr.length || next >= arr.length)
                        break;

                    for (int l = index; l >= 0; l = l - d) {
                        int start = l;
                        int dest = l + d;
                        if(arr[start] < arr[dest])
                            break;
                        else {
                            int temp = arr[dest];
                            arr[dest] = arr[start];
                            arr[start] = temp;
                        }
                    }
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        ShellSort shellSort = new ShellSort();
        int[] arr = {5, 8, 6, 3, 9, 2, 1, 7};
        int[] ds = {4, 2, 1};
        System.out.println(Arrays.toString(shellSort.sort(arr, ds)));
    }

}
