package com.algorithm.leetcode.algorithm;

import java.util.HashSet;
import java.util.Set;

public class FindMaxK {

    public static void main(String[] args) {
        int[] nums = {-1, 2, -3, 3};
//        int[] nums = {-1, 10, 6, 7, -7, 1};
//        int[] nums = {-10, 8, 6, 7, -2, -3};
        int result = findMaxK(nums);
        System.out.println(result);
    }

    public static int findMaxK(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int result = -1;
        for (int n : nums) {
            set.add(n);
        }
        for (int n : nums) {
            if (n > 0 && set.contains(-n)) {
                result = Math.max(result, n);
            }
        }
        return result;
    }
}
