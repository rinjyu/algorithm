package com.algorithm.leetcode.algorithm;

public class MinCostToMoveChips {

    public static void main(String[] args) {
        int[] position = {1, 2, 3};
//        int[] position = {2, 2, 2, 3, 3};
//        int[] position = {1, 1000000000};
        int result = minCostToMoveChips(position);
        System.out.println(result);
    }

    public static int minCostToMoveChips(int[] position) {
        int even = 0;
        int odd = 0;
        for (int p : position) {
            if (p % 2 == 0) {
                odd++;
            } else {
                even++;
            }
        }
        return Math.min(even, odd);
    }
}
