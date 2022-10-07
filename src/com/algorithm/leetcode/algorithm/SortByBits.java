package com.algorithm.leetcode.algorithm;

import java.util.Arrays;

public class SortByBits {

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8};
//        int[] arr = {1024, 512, 256, 128, 64, 32, 16, 8, 4, 2, 1};
        int[] result = sortByBits(arr);
        System.out.println(Arrays.toString(result));
    }

    public static int[] sortByBits(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] += Integer.bitCount(arr[i]) * 10001;
        }
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            arr[i] %= 10001;
        }
        return arr;
    }
}
