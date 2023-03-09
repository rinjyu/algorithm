package com.algorithm.leetcode.algorithm;

public class CountHillValley {

    public static void main(String[] args) {
        int[] nums = {2, 4, 1, 1, 6, 5};
//        int[] nums = {6, 6, 5, 5, 4, 1};
        int result = countHillValley(nums);
        System.out.println(result);
    }

    public static int countHillValley(int[] nums) {
        int count = 0;
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                nums[i] = nums[i - 1];
                continue;
            }
            if (nums[i] > nums[i - 1] && nums[i] > nums[i + 1]) {
                count++;
            } else if (nums[i] < nums[i - 1] && nums[i] < nums[i + 1]) {
                count++;
            }
        }
        return count;
    }
}
