package com.algorithm.leetcode.algorithm;

public class ValidMountainArray {

    public static void main(String[] args) {
//        int[] array = {2,1};
//        int[] array = {3,5,5};
        int[] array = {0,3,2,1};
        boolean result = validMountainArray(array);
        System.out.println("result={}" + result);
    }

    public static boolean validMountainArray(int[] arr) {
        if (!isValidArray(arr)) {
            return false;
        }

        int max = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                max = i;
                break;
            }
        }

        if (max == 0) {
            return false;
        }

        for (int i = 0; i < max; i++) {
            if (arr[i] >= arr[i + 1]) {
                return false;
            }
        }

        for (int i = max; i < arr.length - 1; i++) {
            if (arr[i] <= arr[i + 1]) {
                return false;
            }
        }

        return true;
    }

    public static boolean isValidArray(int[] array) {
        return array.length >= 3;
    }
}
