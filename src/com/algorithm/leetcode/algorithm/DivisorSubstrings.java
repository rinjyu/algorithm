package com.algorithm.leetcode.algorithm;

public class DivisorSubstrings {

    public static void main(String[] args) {
        int num = 240;
        int k = 2;
//        int num = 430043;
//        int k = 2;
        int result = divisorSubstrings(num, k);
        System.out.println(result);
    }

    public static int divisorSubstrings(int num, int k) {
        int count = 0;
        String s = String.valueOf(num);
        for (int i = 0; i <= s.length() - k; i++) {
            int value = Integer.parseInt(s.substring(i, i + k));
            if (value != 0 && num % value == 0) {
                count++;
            }
        }
        return count;
    }
}
