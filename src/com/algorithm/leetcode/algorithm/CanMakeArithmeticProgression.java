package com.algorithm.leetcode.algorithm;

import java.util.Arrays;

public class CanMakeArithmeticProgression {

    public static void main(String[] args) {
        int[] arr = {3, 5, 1};
//        int[] arr = {1, 2, 4};
        boolean result = canMakeArithmeticProgression(arr);
        System.out.println(result);
    }

    public static boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int diff = arr[1] - arr[0];
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i + 1] - arr[i] != diff) {
                return false;
            }
        }
        return true;
    }
}
