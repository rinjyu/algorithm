package com.algorithm.leetcode.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinSubsequence {

    public static void main(String[] args) {
        int[] nums = {4, 3, 10, 9, 8};
//        int[] nums = {4, 4, 7, 6, 7};
        List<Integer> result = minSubsequence(nums);
        System.out.println(Arrays.toString(result.toArray()));
    }

    public static List<Integer> minSubsequence(int[] nums) {
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();
        int sum = 0;
        int result = 0;
        for (int n : nums) {
            sum += n;
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            list.add(nums[i]);
            result += nums[i];
            if (result > sum - result) {
                return list;
            }
        }
        return list;
    }
}
