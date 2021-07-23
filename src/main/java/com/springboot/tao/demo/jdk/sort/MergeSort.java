package com.springboot.tao.demo.jdk.sort;

import java.util.Arrays;

/**
 * @Author: carter
 * @Date: 2021/7/23
 * 并归排序
 */
public class MergeSort {

    public void sort(int[] arr, int start, int last) {
        if(start < last){
            int mid = (start + last) / 2;
            sort(arr, start, mid);
            sort(arr, mid + 1, last);
            sort1(arr, start, mid, last);
        }
    }

    public void sort1(int[] arr, int start, int mid, int last) {
        int[] temp = new int[last - start + 1];
        int tempIndex = 0;
        int i = start, j = mid + 1;
        for (; i <= mid; ) {
            for (; j <= last;) {
                int left = arr[i];
                int right = arr[j];
                if(left < right){
                    temp[tempIndex] = left;
                    tempIndex ++;
                    i++;
                }else{
                    temp[tempIndex] = right;
                    tempIndex ++;
                    j++;
                }
                break;
            }

            // 左边遍历完了，右边直接全部添加进去
            // 右边遍历完了，左边直接全部添加进去
            if(i == mid + 1 || j == last + 1) {
                int k = i == mid +1 ? j : i;
                int n = i == mid +1 ? last : mid;
                for (; k <= n; k++) {
                    temp[tempIndex] = arr[k];
                    tempIndex ++;
                }
                break;
            }
        }

        for (int k = 0; k < temp.length; k++) {
            arr[start + k] = temp[k];
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        MergeSort mergeSort = new MergeSort();
        int[] arr = {3, 1, 6, 5, 2, 9, 8, 7};
        mergeSort.sort(arr, 0, arr.length -1);
        System.out.println(Arrays.toString(arr));
    }
}
