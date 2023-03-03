package com.algorithm.leetcode.algorithm;

public class Search {

    public static void main(String[] args) {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 9;
//        int[] nums = {-1, 0, 3, 5, 9, 12};
//        int target = 2;
        int result = search(nums, target);
        System.out.println(result);
    }

    public static int search(int[] nums, int target) {
        int i = 0;
        int j = nums.length - 1;
        while (i <= j) {
            int k = i + (j - i) / 2;
            if (nums[k] == target) {
                return k;
            } else if (nums[k] > target) {
                j = k - 1;
            } else {
                i = k + 1;
            }
        }
        return -1;
    }
}
