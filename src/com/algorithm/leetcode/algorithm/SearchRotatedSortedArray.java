package com.algorithm.leetcode.algorithm;

import java.util.Objects;

public class SearchRotatedSortedArray {

    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;
//        int[] nums = {4,5,6,7,0,1,2};
//        int target = 3;
//        int[] nums = {1};
//        int target = 0;
        int result = search(nums, target);
        System.out.println(result);
    }

    public static int search(int[] nums, int target) {
        if (!isValidArray(nums)) {
            return -1;
        }
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int middle = (left + right) / 2;
            if (nums[middle] == target) {
                return middle;
            }
            if (nums[left] <= nums[middle]) {
                if (target >= nums[left] && target <= nums[middle]) {
                    right = middle - 1;
                } else {
                    left = middle + 1;
                }
            } else {
                if (target >= nums[middle] && target <= nums[right]) {
                    left = middle + 1;
                } else {
                    right = middle - 1;
                }
            }
        }
        return -1;
    }

    private static boolean isValidArray(int[] nums) {
        return !Objects.isNull(nums) && nums.length <= 5000;
    }
}
