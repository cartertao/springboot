package com.springboot.tao.demo.jdk.algorithm;

import java.util.Arrays;

/**
 * @author taozhiwei
 * @date 2020/8/5 16:04
 */
public class DynamicProgramming {

    public static void main(String[] args) {
        //int sum = steps(arr1.length);
        //System.out.println(Arrays.toString(arr1));

        int[][] dp = dp(10);
        for (int i = 0; i < dp.length; i++) {
            System.out.println(Arrays.toString(dp[i]));
        }
    }

    /**
     * 指定台阶，每次跳1或者2层，一共有多少种跳法
     */
    static int [] arr1 = new int[50];
    public static int steps(int count){
        for(int i = 1; i < count; i ++){
            if(i  > 2){
                arr1[i-1] = arr1[i -3] + arr1[i - 2];
            }else {
                arr1[i-1] = i;
            }
        }
        return arr1[count - 1];
    }

    /**
     * 背包，重量和价值，求指定重量的最高价值
     * 产品：重量1，价值2   重量2价值3  重量3价值4  重量4价值5  重量5价值6
     * @see <a href="https://blog.csdn.net/Rex_WUST/article/details/89336939"></a>
     */
    static int [] weights = {2,3,4,5,6,7,8,9,10};
    static int [] values = {3,4,5,6,7,8,9,10,11};
    public static int[][] dp(int sumWeight){
        int [][] arr = new int[sumWeight + 1][weights.length];
        // i:背包总大小      j:产品索引   [i][j]:指定产品数量和背包指定大小下的最高价
        for (int i = 1; i < arr.length; i++) {
            int [] arrWeight = arr[i];
            for (int j = 0; j < arrWeight.length; j++) {
                if(j == 0){
                    if(weights[j] > i)
                        continue;
                    else {
                        arr[i][j] = values[j];
                        continue;
                    }
                }else if(weights[j] > i){
                    arr[i][j] = arr[i][j - 1];
                    continue;
                }

                if(arr[i][j-1] >= arr[i - weights[j]][j - 1] + values[j]){
                    arr[i][j] = arr[i][j-1];
                }else{
                    arr[i][j] = arr[i - weights[j]][j - 1] + values[j];
                }
            }
        }
        return arr;
    }
}
