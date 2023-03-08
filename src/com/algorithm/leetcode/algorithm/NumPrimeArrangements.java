package com.algorithm.leetcode.algorithm;

public class NumPrimeArrangements {

    public static void main(String[] args) {
        int n = 5;
//        int n = 100;
        int result = numPrimeArrangements(n);
        System.out.println(result);
    }

    public static int numPrimeArrangements(int n) {
        int mod = (int) (Math.pow(10, 9) + 7);
        boolean[] arr = new boolean[n + 1];
        int noPrimeCount = 1;

        for (int i = 2; i * i <= n; i++) {
            for (int j = i * 2; j <= n; j += i) {
                if (!arr[j]) {
                    arr[j] = true;
                    noPrimeCount++;
                }
            }
        }

        int primeCount = n - noPrimeCount;
        long sum = 1;

        for (int i = 1; i <= Math.max(primeCount, noPrimeCount); i++) {
            if (i <= Math.min(primeCount, noPrimeCount)) {
                sum *= ((long) i * i);
                sum %= mod;
            } else {
                sum *= i;
                sum %= mod;
            }
        }

        return (int) sum;
    }
}
