package com.algorithm.leetcode.algorithm;

import java.util.Arrays;

public class ReplaceElements {

    public static void main(String[] args) {
        int[] arr = {17, 18, 5, 4, 6, 1};
//        int[] arr = {400};
        int[] result = replaceElements(arr);
        System.out.println(Arrays.toString(result));
    }

    public static int[] replaceElements(int[] arr) {
        int length = arr.length;
        if (length == 0) {
            return arr;
        }
        int max = -1;
        for (int i = length - 1; i >= 0; i--) {
            int temp = arr[i];
            arr[i] = max;
            max = Math.max(temp, max);
        }
        return arr;
    }
}
