package com.algorithm.leetcode.algorithm;

public class SmallestEqual {

    public static void main(String[] args) {
        int[] nums = {0, 1, 2};
//        int[] nums = {4, 3, 2, 1};
//        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        int result = smallestEqual(nums);
        System.out.println(result);
    }

    public static int smallestEqual(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (i % 10 == nums[i]) {
                return i;
            }
        }
        return -1;
    }
}
