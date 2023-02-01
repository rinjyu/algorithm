package com.algorithm.leetcode.algorithm;

public class FindSpecialInteger {

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 6, 6, 6, 6, 7, 10};
//        int[] arr = {1, 1};
        int result = findSpecialInteger(arr);
        System.out.println(result);
    }

    public static int findSpecialInteger(int[] arr) {
        int length = arr.length;
        int i = length / 4;
        for (int j = 0; j < length - i; j++) {
            if (arr[j] == arr[j + i]) {
                return arr[j];
            }
        }
        return -1;
    }
}
