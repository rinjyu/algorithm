package com.algorithm.leetcode.algorithm;

import java.util.Arrays;
import java.util.Objects;

public class SearchInsertPosition {

    public static void main(String[] args) {
//        int[] nums = {1,3,5,6};
//        int target = 5;
//        int[] nums = {1,3,5,6};
//        int target = 2;
//        int[] nums = {1,3,5,6};
//        int target = 7;
        int[] nums = {1,3};
        int target = 2;
        int result = searchInsert(nums, target);
        System.out.println(result);
    }

    public static int searchInsert(int[] nums, int target) {
        if (!isValidArray(nums)) {
            return -1;
        }
        if (!isValidTarget(target)) {
            return -1;
        }
        int result = 0;
        int middleIndex = nums.length / 2;
        int startIndex;
        int endIndex;
        if (nums[middleIndex] <= target) {
            startIndex = middleIndex;
            endIndex = nums.length - 1;
        } else {
            startIndex = 0;
            endIndex = middleIndex - 1;
        }
        int findIndex = Arrays.binarySearch(nums, target);
        if (findIndex > -1) {
            return findIndex;
        }
        for (int i = startIndex; i <= endIndex; i++) {
            int nextIndex = Math.min(i + 1, endIndex);
            int current = nums[i];
            int next = nums[nextIndex];
            if (target < current) {
                return i;
            }
            if (nextIndex == endIndex && target >= next) {
                return nextIndex + 1;
            }
        }
        return result;
    }

    private static boolean isValidArray(int[] nums) {
        return !Objects.isNull(nums) && nums.length >= 1 && nums.length <= 10000;
    }

    private static boolean isValidTarget(int target) {
        return target >= -10000 && target <= 10000;
    }
}
