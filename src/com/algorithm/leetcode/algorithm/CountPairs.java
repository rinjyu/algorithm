package com.algorithm.leetcode.algorithm;

public class CountPairs {

    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 2, 2, 1, 3};
        int k = 2;
//        int[] nums = {1, 2, 3, 4};
//        int k = 1;
        int result = countPairs(nums, k);
        System.out.println(result);
    }

    public static int countPairs(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if ((nums[i] == nums[j]) && (i * j) % k == 0) {
                    count++;
                }
            }
        }
        return count;
    }
}
