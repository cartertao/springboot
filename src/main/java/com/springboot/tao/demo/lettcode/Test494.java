package com.springboot.tao.demo.lettcode;

import java.util.Arrays;

/**
 * @Author: carter
 * @Date: 2021/6/7
 */
public class Test494 {

    public int findTargetSumWays(int[] nums, int target) {
        return back(nums, 0, 0, target);
    }

    public int back(int[] nums, int result, int index, int target){
        int y = 0;
        if ( index == nums.length - 1) {
            if (result + nums[index] == target)
                y++;
            if (result - nums[index] == target)
                y++;
        } else {
            y += back(nums, result + nums[index], index + 1, target);
            y += back(nums, result - nums[index], index + 1, target);
        }
        return y;
    }

    public static void main(String[] args) {
        Test494 test494 = new Test494();
        int[] arr = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1};
        int target = 1;
        int result = test494.findTargetSumWays(arr, target);
        System.out.println(result);
    }
}
