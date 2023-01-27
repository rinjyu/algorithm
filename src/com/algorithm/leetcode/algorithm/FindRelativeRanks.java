package com.algorithm.leetcode.algorithm;

import java.util.Arrays;

public class FindRelativeRanks {

    public static void main(String[] args) {
        int[] score = {5, 4, 3, 2, 1};
//        int[] score = {10, 3, 8, 9, 4};
        String[] result = findRelativeRanks(score);
        System.out.println(Arrays.toString(result));
    }

    public static String[] findRelativeRanks(int[] score) {
        int[][] pair = new int[score.length][2];
        for (int i = 0; i < score.length; i++) {
            pair[i][0] = score[i];
            pair[i][1] = i;
        }
        Arrays.sort(pair, (a, b) -> (b[0] - a[0]));
        String[] result = new String[score.length];
        for (int i = 0; i < score.length; i++) {
            if (i == 0) {
                result[pair[i][1]] = "Gold Medal";
            } else if (i == 1) {
                result[pair[i][1]] = "Silver Medal";
            } else if (i == 2) {
                result[pair[i][1]] = "Bronze Medal";
            } else {
                result[pair[i][1]] = String.valueOf( i + 1);
            }
        }
        return result;
    }
}