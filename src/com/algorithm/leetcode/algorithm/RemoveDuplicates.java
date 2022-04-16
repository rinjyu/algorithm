package com.algorithm.leetcode.algorithm;

import java.util.Objects;

public class RemoveDuplicates {

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3};
//        int[] nums = {0, 0, 1, 1, 1, 1, 2, 3, 3};
        int result = removeDuplicates(nums);
        System.out.println(result);
    }

    public static int removeDuplicates(int[] nums) {
        if (!isValidArray(nums)) {
            return 0;
        }
        int duplicateCount = 1;
        int i = 0;
        for (int j = 0; j < nums.length - 1; j++) {
            if (nums[j] == nums[j + 1]) {
                duplicateCount++;
            } else {
                i++;
                nums[i] = nums[j + 1];
                duplicateCount = 1;
            }
            if (duplicateCount == 2) {
                i++;
                nums[i] = nums[j + 1];
            }
        }
        return i + 1;
    }

    private static boolean isValidArray(int[] nums) {
        return !Objects.isNull(nums) && nums.length >= 1 && nums.length <= 30_000;
    }
}