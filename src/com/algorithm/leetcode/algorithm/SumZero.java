package com.algorithm.leetcode.algorithm;

import java.util.Arrays;

public class SumZero {

    public static void main(String[] args) {
        int n = 5;
//        int n = 3;
//        int n = 1;
        int[] result = sumZero(n);
        System.out.println(Arrays.toString(result));
    }

    public static int[] sumZero(int n) {
        int[] result = new int[n];
        int left = 0;
        int right = n - 1;
        int index = 1;
        while (left < right) {
            result[left++] = index;
            result[right--] = -1 * index;
            index++;
        }
        return result;
    }
}
