package com.algorithm.leetcode.algorithm;

public class ThreeConsecutiveOdds {

    public static void main(String[] args) {
        int[] arr = {2, 6, 4, 1};
//        int[] arr = {1, 2, 34, 3, 4, 5, 7, 23, 12};
        boolean result = threeConsecutiveOdds(arr);
        System.out.println(result);
    }

    public static boolean threeConsecutiveOdds(int[] arr) {
        int count = 0;
        for (int n : arr) {
            if (n % 2 == 0) {
                count = 0;
            } else {
                count++;
            }
            if (count == 3) {
                return true;
            }
        }
        return false;
    }
}
