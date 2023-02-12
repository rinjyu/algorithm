package com.algorithm.leetcode.algorithm;

public class KLengthApart {

    public static void main(String[] args) {
        int[] nums = {1, 0, 0, 0, 1, 0, 0, 1};
        int k = 2;
//        int[] nums = {1, 0, 0, 1, 0, 1};
//        int k = 2;
        boolean result = kLengthApart(nums, k);
        System.out.println(result);
    }

    public static boolean kLengthApart(int[] nums, int k) {
        int current = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                if (i - current - 1 < k && current != -1) {
                    return false;
                }
                current = i;
            }
        }
        return true;
    }
}
