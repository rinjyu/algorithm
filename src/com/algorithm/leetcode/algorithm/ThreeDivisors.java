package com.algorithm.leetcode.algorithm;

public class ThreeDivisors {

    public static void main(String[] args) {
        int n = 2;
//        int n = 4;
        boolean result = isThree(n);
        System.out.println(result);
    }

    public static boolean isThree(int n) {
        int sqrt = (int) Math.sqrt(n);
        if (sqrt * sqrt != n) {
            return false;
        }
        int division = 1;
        for (int i = 1; i < sqrt; i++) {
            if (n % i == 0) {
                division += 2;
            }
        }
        return division == 3;
    }
}
