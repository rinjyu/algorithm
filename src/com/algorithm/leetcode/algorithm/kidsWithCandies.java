package com.algorithm.leetcode.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class kidsWithCandies {

    public static void main(String[] args) {
        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;
//        int[] candies = {4, 2, 1, 1, 2};
//        int extraCandies = 1;
//        int[] candies = {12, 1, 12};
//        int extraCandies = 10;
        List<Boolean> result = kidsWithCandies(candies, extraCandies);
        System.out.println(Arrays.toString(result.toArray()));
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int max = candies[0];
        for (int n : candies) {
            if (max < n) {
                max = n;
            }
        }
        for (int n : candies) {
            if (n + extraCandies >= max) {
                result.add(true);
            } else {
                result.add(false);
            }
        }
        return result;
    }
}
