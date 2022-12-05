package com.algorithm.leetcode.algorithm;

import java.util.Arrays;

public class TrimMean {

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3};
//        int[] arr = {6, 2, 7, 5, 1, 2, 0, 3, 10, 2, 5, 0, 5, 5, 0, 8, 7, 6, 8, 0};
//        int[] arr = {6, 0, 7, 0, 7, 5, 7, 8, 3, 4, 0, 7, 8, 1, 6, 8, 1, 1, 2, 4, 8, 1, 9, 5, 4, 3, 8, 5, 10, 8, 6, 6, 1, 0, 6, 10, 8, 2, 3, 4};
        double result = trimMean(arr);
        System.out.println(result);
    }

    public static double trimMean(int[] arr) {
        Arrays.sort(arr);
        int length = arr.length;
        double sum = 0;
        int count = 0;
        for (int i = length / 20; i < (length - (length / 20)); i++) {
            sum += arr[i];
            count++;
        }
        return sum / count;
    }
}
