package com.algorithm.leetcode.algorithm;

public class AlternatingBits {

    public static void main(String[] args) {
        int n = 5;
//        int n = 7;
//        int n = 11;
        boolean result = hasAlternatingBits(n);
        System.out.println(result);
    }

    public static boolean hasAlternatingBits(int n) {
        while (n > 0) {
            int i = n;
            if((n & 1) == ((i >> 1) & 1)) {
                return false;
            }
            n = n >> 1;
        }
        return true;
    }
}
