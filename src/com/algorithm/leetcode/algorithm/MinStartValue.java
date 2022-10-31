package com.algorithm.leetcode.algorithm;

public class MinStartValue {

    public static void main(String[] args) {
        int[] nums = {-3, 2, -3, 4, 2};
//        int[] nums = {1, 2};
//        int[] nums = {1, -2, -3};
        int result = minStartValue(nums);
        System.out.println(result);
    }

    public static int minStartValue(int[] nums) {
        int min = 0;
        int sum = 0;
        for (int n : nums) {
            sum += n;
            min = Math.min(sum, min);
        }
        if (min < 0) {
            return min * (-1) + 1;
        }
        return 1;
    }
}
