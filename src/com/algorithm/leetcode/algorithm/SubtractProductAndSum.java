package com.algorithm.leetcode.algorithm;

public class SubtractProductAndSum {

    public static void main(String[] args) {
        int n = 234;
//        int n = 4421;
        int result = subtractProductAndSum(n);
        System.out.println(result);
    }

    public static int subtractProductAndSum(int n) {
        int subtract = 1;
        int sum = 0;
        while (n > 0) {
            int number = n % 10;
            subtract *= number;
            sum += number;
            n /= 10;
        }
        return subtract - sum;
    }
}
