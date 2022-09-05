package com.algorithm.leetcode.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TargetIndices {

    public static void main(String[] args) {
        int[] nums = {1, 2, 5, 2, 3};
        int target = 2;
//        int[] nums = {1, 2, 5, 2, 3};
//        int target = 3;
//        int[] nums = {1, 2, 5, 2, 3};
//        int target = 5;
        List<Integer> result = targetIndices(nums, target);
        System.out.println(Arrays.toString(result.toArray()));
    }

    public static List<Integer> targetIndices(int[] nums, int target) {
        int count = 0;
        int less = 0;
        for (int n : nums) {
            if (n == target) {
                count++;
            }
            if (n < target) {
                less++;
            }
        }

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            result.add(less + i);
        }
        return result;
    }
}
