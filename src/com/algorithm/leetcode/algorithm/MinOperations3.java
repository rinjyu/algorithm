package com.algorithm.leetcode.algorithm;

public class MinOperations3 {

    public static void main(String[] args) {
        String s = "0100";
//        String s = "10";
//        String s = "1111";
        int result = minOperations(s);
        System.out.println(result);
    }

    public static int minOperations(String s) {
        int result = 0;
        int length = s.length();
        for (int i = 0; i < length; i++) {
            if (s.charAt(i) - '0' != i % 2) {
                result++;
            }
        }
        return Math.min(result, length - result);
    }
}
