package com.algorithm.leetcode.algorithm;

public class FibonacciNumber {

    public static void main(String[] args) {
        int n = 2;
//        int n = 3;
//        int n = 4;
        int result = fib(n);
        System.out.println(result);
    }

    public static int fib(int n) {
        if (n < 2) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }
}
