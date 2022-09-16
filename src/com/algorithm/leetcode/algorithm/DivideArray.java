package com.algorithm.leetcode.algorithm;

import java.util.HashSet;
import java.util.Set;

public class DivideArray {

    public static void main(String[] args) {
        int[] nums = {3, 2, 3, 2, 2, 2};
//        int[] nums = {1, 2, 3, 4};
        boolean result = divideArray(nums);
        System.out.println(result);
    }

    public static boolean divideArray(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) {
            if (set.contains(n)) {
                set.remove(n);
            } else {
                set.add(n);
            }
        }
        return set.size() == 0;
    }
}
