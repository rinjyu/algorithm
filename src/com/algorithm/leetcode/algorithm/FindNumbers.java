package com.algorithm.leetcode.algorithm;

public class FindNumbers {

    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};
//        int[] nums = {555, 901, 482, 1771};
        int result = findNumbers(nums);
        System.out.println(result);
    }

    public static int findNumbers(int[] nums) {
        int result = 0;
        for (int n : nums) {
            int count = (int) (Math.log10(n) + 1);
            if (count % 2 == 0) {
                result++;
            }
        }
        return result;
    }
}
