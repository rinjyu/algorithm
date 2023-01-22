package com.algorithm.leetcode.algorithm;

public class MaximumPopulation {

    public static void main(String[] args) {
        int[][] logs = {{1993, 1999}, {2000, 2010}};
//        int[][] logs = {{1950, 1961}, {1960, 1971}, {1970, 1981}};
        int result = maximumPopulation(logs);
        System.out.println(result);

    }

    public static int maximumPopulation(int[][] logs) {
        int[] result = new int[101];
        int max = 0;
        int index = 0;
        int sum = 0;
        for (int i = 0; i < logs.length; i++) {
            result[logs[i][0] - 1950]++;
            result[logs[i][1] - 1950]--;
        }
        for (int i = 0; i < result.length; i++) {
            sum += result[i];
            if (sum > max) {
                max = sum;
                index = i;
            }
        }
        return index + 1950;
    }
}
