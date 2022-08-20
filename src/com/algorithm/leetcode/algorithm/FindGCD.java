package com.algorithm.leetcode.algorithm;

public class FindGCD {

    public static void main(String[] args) {
        int[] nums = {2, 5, 6, 9, 10};
//        int[] nums = {7, 5, 6, 8, 3};
//        int[] nums = {3, 3};
        int result = findGCD(nums);
        System.out.println(result);
    }

    public static int findGCD(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        for (Integer i : nums) {
            min = Math.min(min, i);
            max = Math.max(max, i);
        }
        return getGCD(min, max);
    }

    private static int getGCD(int min, int max) {
        if (max == 0) {
            return min;
        }
        return getGCD(max, min % max);
    }
}
