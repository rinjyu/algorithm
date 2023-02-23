package com.algorithm.leetcode.algorithm;

public class FindPoisonedDuration {

    public static void main(String[] args) {
        int[] timeSeries = {1, 4};
        int duration = 2;
//        int[] timeSeries = {1, 2};
//        int duration = 2;
        int result = findPoisonedDuration(timeSeries, duration);
        System.out.println(result);
    }

    public static int findPoisonedDuration(int[] timeSeries, int duration) {
        int result = duration;
        int prev = timeSeries[0];
        for (int i = 1; i < timeSeries.length; i++) {
            if (timeSeries[i] <= timeSeries[i - 1] + duration) {
                result += timeSeries[i] - timeSeries[i - 1];
            } else {
                result += duration;
            }
        }
        return result;
    }
}
