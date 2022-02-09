package com.algorithm.leetcode.algorithm;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;

public class FindPairs {

    public static void main(String[] args) {
        int[] nums = {3, 1, 4, 1, 5};
        int k = 2;
//        int[] nums = {1, 2, 3, 4, 5};
//        int k = 1;
//        int[] nums = {1, 3, 1, 5, 4};
//        int k = 0;
//        int[] nums = {1, 2, 4, 4, 3, 3, 0, 9, 2, 3};
//        int k = 3;
        int result = findPairs(nums, k);
        System.out.println(result);
    }

    public static int findPairs(int[] nums, int k) {
        if (!isValidArray(nums)) {
            return -1;
        }
        if (!isValidNumber(k)) {
            return -1;
        }

        Arrays.sort(nums);
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (i != 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            for (int j = i + 1; j < nums.length; j++) {
                if (j != i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }
                if (nums[j] - nums[i] == k) {
                    set.add(String.format("%d-%d", nums[j], nums[i]));
                    break;
                }
            }
        }
        return set.size();
    }

    public static boolean isValidArray(int[] nums) {
        return !Objects.isNull(nums) && nums.length >= 1 && nums.length <= 10000;
    }

    public static boolean isValidNumber(int num) {
        return num >= 0 && num <= 10000000;
    }
}
