package com.algorithm.leetcode.algorithm;

public class UnequalTriplets {

    public static void main(String[] args) {
        int[] nums = {4, 4, 2, 4, 3};
//        int[] nums = {1, 1, 1, 1, 1};
        int result = unequalTriplets(nums);
        System.out.println(result);
    }

    public static int unequalTriplets(int[] nums) {
        int length = nums.length;
        int count = 0;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                for (int k = j + 1; k < length; k++) {
                    if(nums[i] != nums[j]
                            && nums[i] != nums[k]
                            && nums[j] != nums[k]) {
                        count++;
                    }
                }
            }
        }
        return count++;
    }
}
