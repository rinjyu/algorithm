package com.algorithm.leetcode.algorithm;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DistinctAverages {

    public static void main(String[] args) {
        int[] nums = {4, 1, 4, 0, 3, 5};
//        int[] nums = {1, 100};
        int result = distinctAverages(nums);
        System.out.println(result);
    }

    public static int distinctAverages(int[] nums) {
        Arrays.sort(nums);
        Set<Double> set = new HashSet<>();
        int length = nums.length;
        for (int i = 0; i < length / 2; i++) {
            set.add((nums[i] + nums[length - i - 1]) / 2.0);
        }
        return set.size();
    }
}
