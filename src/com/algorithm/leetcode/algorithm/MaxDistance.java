package com.algorithm.leetcode.algorithm;

public class MaxDistance {

    public static void main(String[] args) {
        int[] colors = {1, 1, 1, 6, 1, 1, 1};
//        int[] colors = {1, 8, 3, 8, 3};
//        int[] colors = {0, 1};
        int result = maxDistance(colors);
        System.out.println(result);
    }

    public static int maxDistance(int[] colors) {
        int length = colors.length;
        int i = 0;
        int j = length - 1;
        while (colors[j] == colors[0]) {
            j--;
        }
        while (colors[i] == colors[length - 1]) {
            i++;
        }
        return Math.max(colors.length - i - 1, j);
    }
}
