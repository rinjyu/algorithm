package com.algorithm.leetcode.algorithm;

import java.util.HashSet;
import java.util.Set;

public class DistributeCandies {

    public static void main(String[] args) {
        int[] candyType = {1, 1, 2, 2, 3, 3};
//        int[] candyType = {1, 1, 2, 3};
//        int[] candyType = {6, 6, 6, 6};
        int result = distributeCandies(candyType);
        System.out.println(result);
    }

    public static int distributeCandies(int[] candyType) {
        Set<Integer> set = new HashSet<>();
        for (int n : candyType) {
            set.add(n);
        }
        return Math.min(set.size(), candyType.length / 2);
    }
}
