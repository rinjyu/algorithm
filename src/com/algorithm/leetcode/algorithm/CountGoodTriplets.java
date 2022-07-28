package com.algorithm.leetcode.algorithm;

public class CountGoodTriplets {

    public static void main(String[] args) {
        int[] arr = {3, 0, 1, 1, 9, 7};
        int a = 7;
        int b = 2;
        int c = 3;
//        int[] arr = {1, 1, 2, 2, 3};
//        int a = 0;
//        int b = 0;
//        int c = 1;
        int result = countGoodTriplets(arr, a, b, c);
        System.out.println(result);
    }

    public static int countGoodTriplets(int[] arr, int a, int b, int c) {
        int count = 0;
        int length = arr.length;
        for (int i = 0; i < length - 2; i++) {
            for (int j = i + 1; j < length - 1; j++) {
                for (int k = j + 1; k < length; k++) {
                    if (Math.abs(arr[i] - arr[j]) <= a
                            && Math.abs(arr[j] - arr[k]) <= b
                            && Math.abs(arr[k] - arr[i]) <= c) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
