package com.algorithm.leetcode.algorithm;

import java.util.Arrays;

public class ThirdMax {

    public static void main(String[] args) {
        int[] nums = {3, 2, 1};
//        int[] nums = {1, 2};
//        int[] nums = {2, 2, 3, 1};
        int result = thirdMax(nums);
        System.out.println(result);
    }

    public static int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int max = nums[nums.length - 1];
        int temp = nums[nums.length - 1];
        int count = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (temp == nums[i]) {
                continue;
            }
            if (count == 1) {
                return nums[i];
            }
            temp = nums[i];
            count++;
        }
        return max;
    }
}
