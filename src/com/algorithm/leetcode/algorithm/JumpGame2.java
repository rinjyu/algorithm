package com.algorithm.leetcode.algorithm;

import java.util.Objects;

public class JumpGame2 {

    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 1, 4};
//        int[] nums = {3, 2, 1, 0, 4};
        boolean result = canJump(nums);
        System.out.println(result);
    }

    public static boolean canJump(int[] nums) {
        if (!isValidArray(nums)) {
            return false;
        }
        int range = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > range) {
                return false;
            }
            range = Math.max(range, i + nums[i]);
        }
        return true;
    }

    private static boolean isValidArray(int[] nums) {
        return !Objects.isNull(nums) && nums.length >= 1 && nums.length <= 10000;
    }
}