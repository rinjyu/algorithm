package com.algorithm.leetcode.algorithm;

public class HeightChecker {

    public static void main(String[] args) {
        int[] heights = {1, 1, 4, 2, 1, 3};
//        int[] heights = {5, 1, 2, 3, 4};
//        int[] heights = {1, 2, 3, 4, 5};
        int result = heightChecker(heights);
        System.out.println(result);
    }

    public static int heightChecker(int[] heights) {
        int length = heights.length;
        int result = 0;
        int[] array = new int[101];
        for (int height : heights) {
            array[height]++;
        }
        for (int i = 0, j = 0; i < length; i++) {
            while (true) {
                if (array[j] != 0) break;
                j++;
            }
            if (heights[i] != j) {
                result++;
            }
            array[j]--;
        }
        return result;
    }
}
