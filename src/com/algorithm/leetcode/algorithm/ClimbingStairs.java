package com.algorithm.leetcode.algorithm;

public class ClimbingStairs {

    public static void main(String[] args) {
//        int n = 2;
        int n = 3;
        int result = climbStairs(n);
        System.out.println(result);
    }

    public static int climbStairs(int n) {
        if (!isValidStep(n)) {
            return -1;
        }
        if (n == 1) {
            return 1;
        }
        int step1 = 1;
        int step2 = 2;
        int current;
        while (n > 2) {
            current = step1 + step2;
            step1 = step2;
            step2 = current;
            n--;
        }
        return step2;
    }

    private static boolean isValidStep(int n) {
        return n >= 1 && n <= 45;
    }
}