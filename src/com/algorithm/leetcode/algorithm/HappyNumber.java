package com.algorithm.leetcode.algorithm;

public class HappyNumber {

    public static void main(String[] args) {
        int n = 19;
//        int n = 2;
        boolean result = isHappy(n);
        System.out.println(result);
    }

    public static boolean isHappy(int n) {
        int i = n;
        int j = sum(n);
        while (j != 1 && i != j) {
            i = sum(i);
            j = sum(sum(j));
        }
        return j == 1;
    }

    private static int sum(int n) {
        int result = 0;
        while (n > 0) {
            int i = n % 10;
            result += (i * i);
            n /= 10;
        }
        return result;
    }
}
