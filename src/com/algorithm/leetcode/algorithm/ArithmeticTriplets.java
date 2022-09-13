package com.algorithm.leetcode.algorithm;

import java.util.HashSet;
import java.util.Set;

public class ArithmeticTriplets {

    public static void main(String[] args) {
        int[] nums = {0, 1, 4, 6, 7, 10};
        int diff = 3;
//        int[] nums = {4, 5, 6, 7, 8, 9};
//        int diff = 2;
        int result = arithmeticTriplets(nums, diff);
        System.out.println(result);
    }

    public static int arithmeticTriplets(int[] nums, int diff) {
        int count = 0;
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num - diff) && set.contains(num - diff * 2)) {
                count++;
            }
            set.add(num);
        }
        return count;
    }
}
