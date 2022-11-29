package com.algorithm.leetcode.algorithm;

import java.util.Arrays;

public class LastStoneWeight {

    public static void main(String[] args) {
        int[] stones = {2, 7, 4, 1, 8, 1};
//        int[] stones = {1};
        int result = lastStoneWeight(stones);
        System.out.println(result);
    }

    public static int lastStoneWeight(int[] stones) {
        if (stones.length == 1) {
            return stones[0];
        }
        Arrays.sort(stones);
        int last = stones.length - 1;
        int prev = stones.length - 2;
        while (stones[last] != 0) {
            if (stones[prev] == 0) {
                return stones[last];
            }
            stones[last] = stones[last] - stones[prev];
            stones[prev] = 0;
            Arrays.sort(stones);
        }
        return 0;
    }
}
