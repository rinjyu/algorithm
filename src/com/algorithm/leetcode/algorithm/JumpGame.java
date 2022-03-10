package com.algorithm.leetcode.algorithm;

public class JumpGame {

    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 1, 4};
//        int[] nums = {2, 3, 0, 1, 4};
        int result = jump(nums);
        System.out.println(result);
    }

    public static int jump(int[] nums) {
        int count = 0;
        int left = 0;
        int right = 0;
        while (right < nums.length - 1) {
            int max = 0;
            for (int i = left; i <= right; i++) {
                max = Math.max(max, i + nums[i]);
            }
            left = right + 1;
            right = max;
            count++;
        }
        return count;
    }
}