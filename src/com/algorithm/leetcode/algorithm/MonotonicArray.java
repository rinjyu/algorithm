package com.algorithm.leetcode.algorithm;

public class MonotonicArray {

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3};
//        int[] nums = {6, 5, 4, 4};
//        int[] nums = {1, 3, 2};
        boolean result = isMonotonic(nums);
        System.out.println(result);
    }

    public static boolean isMonotonic(int[] nums) {
        int length = nums.length;
        boolean up = true;
        boolean down = true;
        for (int i = 0; i < length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                up = false;
                break;
            }
        }
        for (int i = 0; i < length - 1; i++) {
            if (nums[i] < nums[i + 1]) {
                down = false;
                break;
            }
        }
        return up || down;
    }
}
