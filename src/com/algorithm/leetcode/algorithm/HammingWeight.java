package com.algorithm.leetcode.algorithm;

public class HammingWeight {

    public static void main(String[] args) {
        int n = 00000000000000000000000000001011;
//        int n = 00000000000000000000000010000000;
        int result = hammingWeight(n);
        System.out.println(result);
    }

    public static int hammingWeight(int n) {
        int result = 0;
        while (n != 0) {
            result += Integer.remainderUnsigned(n, 2);
            n = Integer.divideUnsigned(n, 2);
        }
        return result;
    }
}
