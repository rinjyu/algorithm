package com.algorithm.leetcode.algorithm;

public class PowerOfTwo {

    public static void main(String[] args) {
        int n = 1;
//        int n = 16;
//        int n = 3;
        boolean result = isPowerOfTwo(n);
        System.out.println(result);
    }

    public static boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        if (n == 1) {
            return true;
        }
        if (n % 2 == 0) {
            return isPowerOfTwo(n / 2);
        }
        return false;
    }
}
