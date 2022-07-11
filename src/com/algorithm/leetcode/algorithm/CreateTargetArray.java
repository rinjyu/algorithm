package com.algorithm.leetcode.algorithm;

import java.util.Arrays;

public class CreateTargetArray {

    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 3, 4};
        int[] index = {0, 1, 2, 2, 1};
//        int[] nums = {1, 2, 3, 4, 0};
//        int[] index = {0, 1, 2, 3, 0};
        int[] result = createTargetArray(nums, index);
        System.out.println(Arrays.toString(result));
    }

    public static int[] createTargetArray(int[] nums, int[] index) {
        int[] result = new int[nums.length];
        int count = 0;
        while (count < result.length) {
            if (index[count] < count) {
                for (int i = result.length - 1; i > index[count]; i--) {
                    result[i] = result[i - 1];
                }
            }
            result[index[count]] = nums[count];
            count++;
        }
        return result;
    }
}
