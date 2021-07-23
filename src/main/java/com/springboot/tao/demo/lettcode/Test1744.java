package com.springboot.tao.demo.lettcode;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @Author: carter
 * @Date: 2021/6/1
 */
public class Test1744 {
    /**
     * 给你一个下标从 0 开始的正整数数组 candiesCount ，其中 candiesCount[i] 表示你拥有的第 i 类糖果的数目。同时给你一个二维数组 queries ，其中 queries[i] = [favoriteTypei, favoriteDayi, dailyCapi] 。
     *
     * 你按照如下规则进行一场游戏：
     *
     *  1.你从第 0 天开始吃糖果。
     *  2.你在吃完 所有 第 i - 1 类糖果之前，不能 吃任何一颗第 i 类糖果。
     *  3.在吃完所有糖果之前，你必须每天 至少 吃 一颗 糖果。
     * 请你构建一个布尔型数组 answer ，满足 answer.length == queries.length 。answer[i] 为 true 的条件是：在每天吃 不超过 dailyCapi 颗糖果的前提下，你可以在第 favoriteDayi 天吃到第 favoriteTypei 类糖果；
     * 否则 answer[i] 为 false 。注意，只要满足上面 3 条规则中的第二条规则，你就可以在同一天吃不同类型的糖果。
     *
     * 请你返回得到的数组 answer 。
     */

    /**
     * 示例 1：
     *
     * 输入：candiesCount = [7,4,5,3,8], queries = [[0,2,2],[4,2,4],[2,13,1000000000]]
     * 输出：[true,false,true]
     * 提示：
     * 1- 在第 0 天吃 2 颗糖果(类型 0），第 1 天吃 2 颗糖果（类型 0），第 2 天你可以吃到类型 0 的糖果。
     * 2- 每天你最多吃 4 颗糖果。即使第 0 天吃 4 颗糖果（类型 0），第 1 天吃 4 颗糖果（类型 0 和类型 1），你也没办法在第 2 天吃到类型 4 的糖果。换言之，你没法在每天吃 4 颗糖果的限制下在第 2 天吃到第 4 类糖果。
     * 3- 如果你每天吃 1 颗糖果，你可以在第 13 天吃到类型 2 的糖果。
     *
     * 示例 2：
     * 输入：candiesCount = [5,2,6,4,1], queries = [[3,1,2],[4,10,3],[3,10,100],[4,100,30],[1,3,1]]
     * 输出：[false,true,true,false,false]
     */

    /**
     * 总结
     * 1. 每天最少吃一颗
     * 2. 从前往后吃
     * 3. 限制每天最多吃多少个，判断在指定的那一天能否吃到指定类型的糖
     */
    public static boolean[] canEat(int[] candiesCount, int[][] queries) {
        // 每天吃 不超过 dailyCapi 颗糖果的前提下，你可以在第 favoriteDayi 天吃到第 favoriteTypei 类糖果
        // queries[i] = [favoriteTypei, favoriteDayi, dailyCapi] 。
        boolean[] result = new boolean[queries.length];

        HashMap<Long, Long> sumMap = new HashMap<>();
        sumMap.put(-1l, 0l);
        for (int i = 0; i < candiesCount.length; i++) {
            Long value = sumMap.get(i - 1l);
            sumMap.put((long)i, value + candiesCount[i]);
        }

        for (int i = 0; i < queries.length; i++) {
            int[] condition = queries[i];

            long dailyCap = condition[2];  // 限制每天吃的个数
            long favoriteDay = condition[1] + 1; // 第几天
            long favoriteType = condition[0]; // 吃的类型

            /**
             * 极限条件处理
             * 1. 吃的类型不存在
             * 2. 天数 <= 0
             * 3. 每天吃的个数 <= 0
             */
            if(favoriteType < 0 || favoriteDay <= 0 || dailyCap <= 0){
                result[i] = false;
                continue;
            }

            // 获取至少需要吃多少个
            long sumMin = sumMap.get(favoriteType - 1l) + 1l;

            // 获取最多需要吃多少个
            long sumMax = sumMap.get(favoriteType);

            // 总数小于天数
            if ( sumMax < favoriteDay) {
                result[i] = false;
                continue;
            }
            // 获取最少需要每天吃多少个
            long min = sumMin % favoriteDay > 0 ? sumMin / favoriteDay + 1l : sumMin / favoriteDay;

            if(dailyCap >= min)
                result[i] = true;
            else
                result[i] = false;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] candiesCount = {7,4,5,3,8};
        int[][] queries = {{0,2,2},{4,2,4},{2,13,1000000}};
        System.out.println(Arrays.toString(canEat(candiesCount, queries)));


        // [true,true,true,true,true,true,true,true,false,false,
        //  true,true,false,false,false,true,true,false,false,false,
        //  false,false,false,false,false,true,false,false,false,false,
        //  false,true,false,true,true,false,false,false,true,false,false,false,false,false,true,true,true,false,false,false,false,true,false,false,true,false,true,true,false,true,false,false,true,true,true,true,true,false,false,false,true,true,false,false,true,false,true]
    }
    /**
     * [false,false,false,false,false,false,true,false,false,false,false,true,true,false,false,false,false,true,false,true,false,true,true,true,false,false,false,true,false,true,false,false,false,false,true,true,false,true,true,false,false,true,false,true,true,false,true,false,false,true,false,false,false,false,false,true,false,false,false,false,false,false,true,false,true,true,false,false,false,false,false,true,false,true,false,false,false,false,false,false,true,false,true,false,false,false,false,true,false,true,false,false,true,false,true,false,true,false,true,true,false,false,false,true,true,false,false,false,false,false,false,false,false,false,true,false,true,false,false,false,true,false,false,true,false,false,false,false,false,true,false,false,false,true,false,false,false,true,false,false,false,false,true,false,false,true,false,false,true,false,false,true,false,false,true,false,true,false,false,false,false,true,false,false,false,true,false,false,false,false,true,false,false,false,false,f...
     * [true,true,true,true,false,true,true,true,true,true,true,true,true,true,true,true,true,true,false,true,true,true,true,true,true,false,true,true,true,true,false,true,true,true,true,true,true,true,true,true,true,true,true,true,true,false,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,false,true,false,true,true,true,true,true,false,false,true,true,true,false,true,true,true,true,true,true,true,true,true,false,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,false,false,true,true,true,true,false,false,true,true,true,true,true,true,true,true,true,true,true,true,false,true,true,true,true,true,true,true,true,false,false,true,true,true,false,true,true,true,false,true,false,true,true,true,true,true,true,true,true,true,true,true,true,true,false,true,true,true,true,true,true,true,true,false,true,true,true,true,true,true,true,true,false,true,false,true,true,true,true,true,true,true,true,false,true,true,true,true,tru...
     *
     * true,false,true,true,false,false,false,true,false,false,false,false,false,true,true,true,false,false,false,false,true,false,false,true,false,true,true,false,true,false,false,true,true,true,true,true,false,false,false,true,true,false,false,true,false,true]
     * [true,true,true,true,true,true,true,true,false,false,true,true,false,false,false,true,true,false,false,false,false,false,false,false,false,true,false,false,false,false,false,true,false,true,true,false,false,false,true,false,false,false,false,false,true,true,true,false,false,false,false,true,false,false,true,false,true,true,false,true,false,false,true,true,true,true,true,false,false,false,true,true,false,false,true,false,true]
     */
}
