package com.algorithm.leetcode.algorithm;

public class Tribonacci {

    public static void main(String[] args) {
        int n = 4;
//        int n = 25;
        int result = tribonacci(n);
        System.out.println(result);
    }

    public static int tribonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n < 3) {
            return 1;
        }
        int first = 0;
        int second = 1;
        int third = 1;
        int fourth = 0;
        for (int i = 3; i <= n; i++) {
            fourth = first + second + third;
            first = second;
            second = third;
            third = fourth;
        }
        return fourth;
    }
}
