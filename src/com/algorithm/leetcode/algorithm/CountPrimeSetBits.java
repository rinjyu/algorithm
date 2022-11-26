package com.algorithm.leetcode.algorithm;

public class CountPrimeSetBits {

    public static void main(String[] args) {
        int left = 6;
        int right = 10;
//        int left = 10;
//        int right = 15;
        int result = countPrimeSetBits(left, right);
        System.out.println(result);
    }

    public static int countPrimeSetBits(int left, int right) {
        int count = 0;
        for (int i = left; i <= right; i++) {
            if (isPrime(Integer.bitCount(i))) {
                count++;
            }
        }
        return count;
    }

    private static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
