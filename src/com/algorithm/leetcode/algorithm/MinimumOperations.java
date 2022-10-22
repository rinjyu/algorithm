package com.algorithm.leetcode.algorithm;

import java.util.HashSet;
import java.util.Set;

public class MinimumOperations {

    public static void main(String[] args) {
        int[] nums = {1, 5, 0, 3, 5};
//        int[] nums = {0};
        int result = minimumOperations(nums);
        System.out.println(result);
    }

    public static int minimumOperations(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) {
            set.add(n);
        }
        set.remove(0);
        return set.size();
    }
}
