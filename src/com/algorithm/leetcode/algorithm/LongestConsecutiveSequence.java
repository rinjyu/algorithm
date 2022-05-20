package com.algorithm.leetcode.algorithm;

import java.util.Arrays;

public class LongestConsecutiveSequence {

    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};
//        int[] nums = {0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
        int result = longestConsecutive(nums);
        System.out.println(result);
    }

    public static int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        Arrays.sort(nums);
        int max = 1;
        int current = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                if (nums[i] == nums[i - 1] + 1) {
                    current += 1;
                } else {
                    max = Math.max(max, current);
                    current = 1;
                }
            }
        }
        return Math.max(max, current);
    }
}
