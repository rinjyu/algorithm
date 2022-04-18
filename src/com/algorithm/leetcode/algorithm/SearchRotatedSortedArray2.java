package com.algorithm.leetcode.algorithm;

import java.util.Objects;

public class SearchRotatedSortedArray2 {

    public static void main(String[] args) {
        int[] nums = {2, 5, 6, 0, 0, 1, 2};
        int target = 0;
//        int[] nums = {2, 5, 6, 0, 0, 1, 2};
//        int target = 3;
        boolean result = search(nums, target);
        System.out.println(result);
    }

    public static boolean search(int[] nums, int target) {
        if (!isValidArray(nums)) {
            return false;
        }
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int middle = left + (right - left) / 2;
            if (nums[middle] == target) {
                return true;
            }
            if (nums[middle] == nums[right]) {
                right--;
            } else if (nums[middle] > nums[right]) {
                if (nums[left] <= target && nums[middle] > target) {
                    right = middle - 1;
                } else {
                    left = middle + 1;
                }
            } else {
                if (nums[middle] < target && target <= nums[right]) {
                    left = middle + 1;
                } else {
                    right = middle - 1;
                }
            }
        }
        return false;
    }

    private static boolean isValidArray(int[] nums) {
        return !Objects.isNull(nums) && nums.length >= 1 && nums.length <= 5000;
    }
}