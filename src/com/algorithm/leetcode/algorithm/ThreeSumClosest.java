package com.algorithm.leetcode.algorithm;

import java.util.Arrays;
import java.util.Objects;

public class ThreeSumClosest {

    public static void main(String[] args) {
        int[] nums = {-1, 2, 1, -4};
        int target = 1;
//        int[] nums = {0,0,0};
//        int target = 1;
        int result = threeSumClosest(nums, target);
        System.out.println(result);
    }

    public static int threeSumClosest(int[] nums, int target) {
        if (!isValidArray(nums)) {
            return -1;
        }
        if (!isValidTarget(target)) {
            return -1;
        }
        Arrays.sort(nums);
        int range = Integer.MAX_VALUE;
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                int difference = Math.abs(target - sum);
                if (difference < range) {
                    range = difference;
                    result = sum;
                }
                if(sum == target){
                    return target;
                }else if(sum > target){
                    k--;
                }else{
                    j++;
                }
            }
        }
        return result;
    }

    public static boolean isValidArray(int[] nums) {
        return !Objects.isNull(nums) && nums.length >= 3 && nums.length <= 1000;
    }

    public static boolean isValidTarget(int target) {
        return target >= -10000 && target <= 10000;
    }
}
