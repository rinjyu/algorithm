package com.algorithm.leetcode.algorithm;

public class MinOperations {

    public static void main(String[] args) {
        int[] nums = {1, 1, 1};
//        int[] nums = {1, 5, 2, 4, 1};
//       int[] nums = {8};
        int result = minOperations(nums);
        System.out.println(result);
    }

    public static int minOperations(int[] nums) {
        int count = 0;
        int current = 0;
        for (int num : nums) {
            if (current == num) {
                current++;
                count++;
            } else if (current > num) {
                current++;
                count += current - num;
            } else {
                current = num;
            }
        }
        return count;
    }
}
