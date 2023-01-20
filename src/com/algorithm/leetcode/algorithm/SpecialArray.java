package com.algorithm.leetcode.algorithm;

public class SpecialArray {

    public static void main(String[] args) {
        int[] nums = {3, 5};
//        int[] nums = {0, 0};
//        int[] nums = {0, 4, 3, 0, 4};
        int result = specialArray(nums);
        System.out.println(result);
    }

    public static int specialArray(int[] nums) {
        int max = nums.length;
        int min = 0;
        while (min <= max) {
            int mid = min + (max - min) / 2;
            int count = 0;
            for (int n : nums) {
                if (n >= mid) {
                    count++;
                }
            }
            if (count == mid) {
                return mid;
            }
            if (count > mid) {
                min = mid + 1;
            } else {
                max = mid - 1;
            }
        }
        return -1;
    }
}
