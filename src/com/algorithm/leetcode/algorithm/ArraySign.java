package com.algorithm.leetcode.algorithm;

public class ArraySign {

    public static void main(String[] args) {
        int[] nums = {-1, -2, -3, -4, 3, 2, 1};
//        int[] nums = {1, 5, 0, 2, -3};
//        int[] nums = {-1, 1, -1, 1, -1};
        int result = arraySign(nums);
        System.out.println(result);
    }

    public static int arraySign(int[] nums) {
        int sign = 1;
        for (int n : nums) {
            if (n == 0) {
                return 0;
            }
            if (n < 0) {
                sign = -sign;
            }
        }
        return sign;
    }
}
