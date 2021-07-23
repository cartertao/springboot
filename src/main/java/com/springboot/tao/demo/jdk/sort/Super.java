package com.springboot.tao.demo.jdk.sort;

import java.util.Arrays;
import java.util.Random;

/**
 * @author taozhiwei
 * @date 2020/7/20 11:25
 * 快速排序
 */
public class Super {
    static boolean m;
    public static void main(String[] args) {
        int[] arr = {4,3,8,9,7,6,5,2,1,5,2};
        int[] ints = mySort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(ints));
        //int[] ints1 = mySort1(arr, 0, 2);
        //System.out.println(Arrays.toString(ints1));

        System.out.println(m);
    }

    /**
     * 快速排序 挖坑 50行
     */
    public static int []  mySort(int [] arr, int left, int right){
        int start = left, end = right;
        if(right <= left){
            return arr;
        }
        int index = new Random().ints(left, right).limit(1).findAny().getAsInt();
        if(index != 0){
            int temp = arr[left];
            arr[left] = arr[index];
            arr[index] = temp;
        }

        int standard = arr[left];

        while(true){
            //right
            while(true){
                if(right == left)
                    break;
                if(arr[right] < standard){
                    arr[left] = arr[right];
                    left ++;
                    break;
                }
                right -- ;
            }
            //left
            while(true){
                if(right == left)
                    break;
                if(arr[left] >= standard){
                    arr[right] = arr[left];
                    right --;
                    break;
                }
                left ++ ;
            }
            if(left == right){
                arr[left] = standard;
                break;
            }
        }
//        if(right - left == 1){
//            return arr;
//        }

        mySort(arr, start, left - 1);
        mySort(arr, left + 1, end);
        return arr;
    }

    /**
     * 快速排序指针移动法
     */
    public static int []  mySort1(int [] arr, int left, int right){
        int start = left,end = right;
        if(right <= left){
            return arr;
        }
        int index = new Random().ints(left, right).limit(1).findAny().getAsInt();
        if(index != 0){
            int temp = arr[left];
            arr[left] = arr[index];
            arr[index] = temp;
        }

        int standard = arr[left];

        while(true){
            //right
            while(true){
                if(right == left)
                    break;
                if(arr[right] <= standard){
                    left ++;
                    break;
                }
                right -- ;
            }
            //left
            while(true){
                if(right == left) {
                    break;
                }
                if(arr[left] > standard){
                    int temp = arr[right];
                    arr[right] = arr[left];
                    arr[left] = temp;
                    right --;
                    break;
                }
                left ++ ;
            }
            if(left == right){
                int temp = arr[left];
                arr[left] = standard;
                arr[start] = temp;
                break;
            }
        }
        if(right - left == 1){
            return arr;
        }

        mySort1(arr, start, left - 1);
        mySort1(arr, left + 1, end);
        return arr;
    }

    /**
     * 插入排序
     */
    public static int [] mysort2(int [] arr, int left, int right){
        for (int i = left; i < right; i++) {
            for(int j = i; j >= left ; j--){
                if(arr[j + 1] < arr[j]){
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }else{
                    break;
                }
            }
        }
        return arr;
    }


}
