package com.algorithm.leetcode.algorithm;

import java.util.HashSet;
import java.util.Set;

public class IsCovered {

    public static void main(String[] args) {
        int[][] ranges = {{1, 2}, {3, 4}, {5, 6}};
        int left = 2;
        int right = 5;
//        int[][] ranges = {{1, 10}, {10, 20}};
//        int left = 21;
//        int right = 21;
        boolean result = isCovered(ranges, left, right);
        System.out.println(result);
    }

    public static boolean isCovered(int[][] ranges, int left, int right) {
        Set<Integer> set = new HashSet<>();
        for (int[] range : ranges) {
            for (int i = range[0]; i <= range[1]; i++) {
                set.add(i);
            }
        }
        for (int i = left; i <= right; i++) {
            if (!set.contains(i)) {
                return false;
            }
        }
        return true;
    }
}
