package com.algorithm.leetcode.algorithm;

public class UglyNumber {

    public static void main(String[] args) {
        int n = 6;
//        int n = 1;
//        int n = 14;
        boolean result = isUgly(n);
        System.out.println(result);
    }

    public static boolean isUgly(int n) {
        if (n == 0) {
            return false;
        }
        while (n != 1) {
            if (n % 2 == 0) {
                n /= 2;
            } else if (n % 3 == 0) {
                n /= 3;
            } else if (n % 5 == 0) {
                n /= 5;
            } else {
                return false;
            }
        }
        return true;
    }
}