package com.algorithm.leetcode.algorithm;

public class CommonFactors {

    public static void main(String[] args) {
        int a = 12;
        int b = 6;
//        int a = 25;
//        int b = 30;
        int result = commonFactors(a, b);
        System.out.println(result);
    }

    public static int commonFactors(int a, int b) {
        int result = 0;
        int n = gcd(a, b);
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                result++;
            }
        }
        return result;
    }

    private static int gcd(int a, int b) {
        if (a == 0) {
            return b;
        }
        return gcd(b % a, a);
    }
}
