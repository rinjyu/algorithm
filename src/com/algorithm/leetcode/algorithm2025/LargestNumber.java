package com.algorithm.leetcode.algorithm2025;

import java.util.Arrays;

public class LargestNumber {

    public static void main(String[] args) {

        int[] nums = {10, 2};
//        int[] nums = {3, 30, 34, 5, 9};

        System.out.println(largestNumber(nums));
    }

    public static String largestNumber(int[] nums) {

        String[] array = new String[nums.length];
        int i = 0;
        for (int n : nums) {
            array[i++] = String.valueOf(n);
        }

        Arrays.sort(array, (a, b) -> (b + a).compareTo(a + b));
        if ("0".equals(array[0])) {
            return "0";
        }

        StringBuilder result = new StringBuilder();
        for (String s : array) {
            result.append(s);
        }

        return result.toString();
    }
}
