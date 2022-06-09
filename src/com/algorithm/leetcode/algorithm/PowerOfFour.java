package com.algorithm.leetcode.algorithm;

public class PowerOfFour {

    public static void main(String[] args) {
        int n = 16;
//        int n = 5;
//        int n = 1;
        boolean result = isPowerOfFour(n);
        System.out.println(result);
    }

    public static boolean isPowerOfFour(int n) {
        if (n == 0) {
            return false;
        }
        if (n == 1) {
            return true;
        }
        if (n % 4 != 0) {
            return false;
        }
        return isPowerOfFour(n / 4);
    }
}
