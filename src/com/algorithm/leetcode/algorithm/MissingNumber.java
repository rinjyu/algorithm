package com.algorithm.leetcode.algorithm;

public class MissingNumber {

    public static void main(String[] args) {
        int[] nums = {3, 0, 1};
//        int[] nums = {0, 1};
//        int[] nums = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        int result = missingNumber(nums);
        System.out.println(result);
    }

    public static int missingNumber(int[] nums) {
        int total = 0;
        int length = nums.length;
        for (int n : nums) {
            total += n;
        }
        return (length * (length + 1) / 2) - total;
    }
}
