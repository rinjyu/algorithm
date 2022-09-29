package com.algorithm.leetcode.algorithm;

import java.util.Arrays;

public class CanBeEqual {

    public static void main(String[] args) {
        int[] target = {1, 2, 3, 4};
        int[] arr = {2, 4, 1, 3};
//        int[] target = {7};
//        int[] arr = {7};
//        int[] target = {3, 7, 9};
//        int[] arr = {3, 7, 11};
        boolean result = canBeEqual(target, arr);
        System.out.println(result);
    }

    public static boolean canBeEqual(int[] target, int[] arr) {
        Arrays.sort(target);
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (target[i] != arr[i]) {
                return false;
            }
        }
        return true;
    }
}
