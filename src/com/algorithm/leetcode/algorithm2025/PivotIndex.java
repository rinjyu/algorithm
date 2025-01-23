package com.algorithm.leetcode.algorithm2025;

import java.util.Arrays;

public class PivotIndex {

    public static void main(String[] args) {

        int[] nums = {1,7,3,6,5,6};
//        int[] nums = {1,2,3};
//        int[] nums = {2,1,-1};
        System.out.println(pivotIndex(nums));
    }

    public static int pivotIndex(int[] nums) {

        int totalSum = Arrays.stream(nums).sum();
        int leftSum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (leftSum == (totalSum - leftSum - nums[i])) {
                return i;
            }
            leftSum += nums[i];
        }

        return -1;
    }
}
