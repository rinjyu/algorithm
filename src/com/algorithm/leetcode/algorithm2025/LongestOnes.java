package com.algorithm.leetcode.algorithm2025;

public class LongestOnes {

    public static void main(String[] args) {

        int[] nums = {1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0};
        int k = 2;
        System.out.println(longestOnes(nums, k));
    }

    public static int longestOnes(int[] nums, int k) {

        int left = 0;
        int zero = 0;
        int max = 0;
        for (int right = 0; right < nums.length; right++) {

            if (nums[right] == 0) {
                zero++;
            }

            while (zero > k) {
                if (nums[left] == 0) {
                    zero--;
                }
                left++;
            }

            max = Math.max(max, right - left + 1);
        }

        return max;
    }
}
