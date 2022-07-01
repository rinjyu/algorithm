package com.algorithm.leetcode.algorithm;

public class PowerOfThree {

    public static void main(String[] args) {
        int n = 27;
//        int n = 0;
//        int n = 9;
        boolean result = isPowerOfThree(n);
        System.out.println(result);
    }

    public static boolean isPowerOfThree(int n) {
        while (n >= 3) {
            if (n % 3 != 0) {
                return false;
            }
            n /= 3;
        }
        return n == 1;
    }
}
