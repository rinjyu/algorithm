package com.algorithm.leetcode.algorithm;

import java.util.Arrays;

public class CountElements {

    public static void main(String[] args) {
        int[] nums = {11, 7, 2, 15};
//        int[] nums = {-3, 3, 3, 90};
        int result = countElements(nums);
        System.out.println(result);
    }

    public static int countElements(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        int first = nums[0];
        int last = nums[nums.length - 1];
        for (int num : nums) {
            if (first == num) {
                count++;
            } else if (last == num) {
                count++;
            }
        }
        return nums.length - count;
    }
}
