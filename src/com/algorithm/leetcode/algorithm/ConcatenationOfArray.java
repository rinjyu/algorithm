package com.algorithm.leetcode.algorithm;

import java.util.Arrays;

public class ConcatenationOfArray {

    public static void main(String[] args) {
        int[] nums = {1, 2, 1};
//        int[] nums = {1, 3, 2, 1};
        int[] result = getConcatenation(nums);
        System.out.println(Arrays.toString(result));
    }

    public static int[] getConcatenation(int[] nums) {
        int[] result = new int[nums.length * 2];
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            result[i] = nums[i];
            result[i + length] = nums[i];
        }
        return result;
    }
}
