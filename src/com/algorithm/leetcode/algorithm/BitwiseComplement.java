package com.algorithm.leetcode.algorithm;

public class BitwiseComplement {

    public static void main(String[] args) {
        int n = 5;
//        int n = 7;
//        int n = 10;
        int result = bitwiseComplement(n);
        System.out.println(result);
    }

    public static int bitwiseComplement(int n) {
        int mask = 1;
        while (mask < n) {
            mask = (mask << 1) + 1;
        }
        return mask ^ n;
    }
}
