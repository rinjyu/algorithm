package com.algorithm.leetcode.algorithm;

import java.util.Arrays;
import java.util.Objects;

public class SearchRange {

    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
//        int[] nums = {5,7,7,8,8,10};
//        int target = 6;
//        int[] nums ={};
//        int target = 0;
//        int[] nums = {1};
//        int target = 1;
//        int[] nums = {1, 4};
//        int target = 4;
        int[] result = searchRange(nums, target);
        System.out.println(Arrays.toString(result));
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};
        if (!isValidArray(nums)) {
            return result;
        }
        int start = 0;
        int end = nums.length - 1;
        int first = firstValue(nums, target, start, end);
        if (first == -1) {
            return result;
        }
        int last = endValue(nums, target, first);
        result[0] = first;
        result[1] = last;
        return result;
    }

    private static int firstValue(int[] nums, int target, int start, int end) {
        int first = -1;
        while (start <= end) {
            int middle = (start + end) / 2;
            if (nums[middle] == target) {
                first = middle;
                end = middle - 1;
            } else if (nums[middle] > target) {
                end = middle - 1;
            } else {
                start = middle + 1;
            }
        }
        return first;
    }

    private static int endValue(int[] nums, int target, int first) {
        int last = first;
        int start = first + 1;
        int end = nums.length - 1;
        while (start <= end) {
            int middle = (start + end) / 2;
            if (nums[middle] == target) {
                last = middle;
                start = middle + 1;
            } else if (nums[middle] > target) {
                end = middle - 1;
            } else {
                start = middle + 1;
            }
        }
        return last;
    }

    private static boolean isValidArray(int[] nums) {
        return !Objects.isNull(nums) && nums.length <= 100000;
    }
}
