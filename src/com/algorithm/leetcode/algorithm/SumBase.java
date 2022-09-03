package com.algorithm.leetcode.algorithm;

public class SumBase {

    public static void main(String[] args) {
        int n = 34;
        int k = 6;
//        int n = 10;
//        int k = 10;
        int result = sumBase(n, k);
        System.out.println(result);
    }

    public static int sumBase(int n, int k) {
        int sum = 0;
        while (n > 0) {
            sum += n % k;
            n /= k;
        }
        return sum;
    }
}
