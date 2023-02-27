package com.algorithm.leetcode.algorithm;

public class FindKthPositive {

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 7, 11};
        int k = 5;
//        int[] arr = {1, 2, 3, 4};
//        int k = 2;
        int result = findKthPositive(arr, k);
        System.out.println(result);
    }

    public static int findKthPositive(int[] arr, int k) {
        int first = 0;
        int middle;
        int last = arr.length;
        while (first < last) {
            middle = (first + last) / 2;
            if (arr[middle] - 1 - middle < k) {
                first = middle + 1;
            } else {
                last = middle;
            }
        }
        return first + k;
    }
}
