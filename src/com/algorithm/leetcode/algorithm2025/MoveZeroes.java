package com.algorithm.leetcode.algorithm2025;

import java.util.Arrays;

public class MoveZeroes {

    public static void main(String[] args) {

        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes(nums);
    }

    public static void moveZeroes(int[] nums) {

        if (nums.length == 1) {
            return;
        }

        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (num != 0) {
                nums[index] = num;
                if (index != i) {
                    nums[i] = 0;
                }

                index++;
            }
        }

        System.out.println(Arrays.toString(nums));
    }
}