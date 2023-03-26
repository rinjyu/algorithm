package com.algorithm.leetcode.algorithm;

public class Check {

    public static void main(String[] args) {
        int[] nums = {3, 4, 5, 1, 2};
//        int[] nums = {2, 1, 3, 4};
//        int[] nums = {1, 2, 3};
        boolean result = check(nums);
        System.out.println(result);
    }

    public static boolean check(int[] nums) {
        int k = 0;
        int length = nums.length;
        for (int i = 0; i < length; ++i) {
            if (nums[i] > nums[(i + 1) % length]) {
                k++;
            }
            if (k > 1) {
                return false;
            }
        }
        return true;
    }
}
