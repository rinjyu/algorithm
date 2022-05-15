package com.algorithm.leetcode.algorithm;

public class SingleNumber2 {

    public static void main(String[] args) {
        int[] nums = {2, 2, 3, 2};
//        int[] nums = {0, 1, 0, 1, 0, 1, 99};
        int result = singleNumber(nums);
        System.out.println(result);
    }

    public static int singleNumber(int[] nums) {
        int result = -1, n = nums.length;
        for (int i = 0; i < n; i++) {
            int j;
            for (j = 0; j < n; j++) {
                if (j != i && nums[i] == nums[j]) {
                    break;
                }
            }
            if (j == n) {
                result = nums[i];
                break;
            }
        }
        return result;
    }
}
