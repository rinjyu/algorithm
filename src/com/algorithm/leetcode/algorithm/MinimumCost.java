package com.algorithm.leetcode.algorithm;

import java.util.Arrays;

public class MinimumCost {

    public static void main(String[] args) {
        int[] cost = {1, 2, 3};
//        int[] cost = {6, 5, 7, 9, 2, 2};
//        int[] cost = {5, 5};
        int result = minimumCost(cost);
        System.out.println(result);
    }

    public static int minimumCost(int[] cost) {
        int result = 0;
        int length = cost.length;
        Arrays.sort(cost);
        for (int i = 0; i < length; i++) {
            if (i % 3 != length % 3) {
                result += cost[i];
            }
        }
        return result;
    }
}
