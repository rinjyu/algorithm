package com.algorithm.leetcode.algorithm;

public class FindMiddleIndex {

    public static void main(String[] args) {
        int[] nums = {2, 3, -1, 8, 4};
//        int[] nums = {1, -1, 4};
//        int[] nums = {2, 5};
        int result = findMiddleIndex(nums);
        System.out.println(result);
    }

    public static int findMiddleIndex(int[] nums) {
        int sum = 0;
        int prefix = 0;
        int suffix;
        for (int n : nums) {
            sum += n;
        }
        for (int i = 0; i < nums.length; i++) {
            suffix = sum - prefix;
            prefix += nums[i];
            if (prefix == suffix) {
                return i;
            }
        }
        return -1;
    }
}
