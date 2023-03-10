package com.algorithm.leetcode.algorithm;

public class GetMinDistance {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int target = 5;
        int start = 3;
//        int[] nums = {1};
//        int target = 1;
//        int start = 0;
//        int[] nums = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
//        int target = 1;
//        int start = 0;
        int result = getMinDistance(nums, target, start);
        System.out.println(result);
    }

    public static int getMinDistance(int[] nums, int target, int start) {
        int store = Integer.MAX_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                store = i;
            }
            min = Math.min(min, Math.abs(store - start));
        }
        return min;
    }
}
