package com.algorithm.leetcode.algorithm;

public class Pow {

    public static void main(String[] args) {
        double x = 2.00000;
        int n = 10;
//        double x = 2.10000;
//        int n = 3;
//        double x = 2.00000;
//        int n = -2;
        double result = myPow(x, n);
        System.out.println(result);
    }

    public static double myPow(double x, int n) {
        if (!isValidX(x)) {
            return 1.0;
        }
        if (!isValidN(n)) {
            return 1.0;
        }
        double result;
        if (n > 0) {
            result = Math.pow(x, n);
        } else if (n == 0) {
            result = 1.0;
        } else {
            n *= -1;
            result = Math.pow(x, n);
            result = 1 / result;
        }
        if ((result > Integer.MAX_VALUE) || (result < Integer.MIN_VALUE)) {
            result = 0;
        }
        return result;
    }

    private static boolean isValidX(double x) {
        return (x > -100.0) && (x < 100.0);
    }

    private static boolean isValidN(int n) {
        return (n >= Math.pow(-2, 31)) && n <= (Math.pow(2, 31) - 1);
    }
}