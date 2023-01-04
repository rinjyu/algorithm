package com.algorithm.leetcode.algorithm;

public class CheckZeroOnes {

    public static void main(String[] args) {
        String s = "1101";
//        String s = "111000";
//        String s = "110100010";
        boolean result = checkZeroOnes(s);
        System.out.println(result);
    }

    public static boolean checkZeroOnes(String s) {
        int one = 0;
        int zero = 0;
        int longestOne = 0;
        int longestZero = 0;
        for (char c : s.toCharArray()) {
            if (c == 0) {
                zero++;
                longestZero = Math.max(zero, longestZero);
                one = 0;
            } else {
                one++;
                longestOne = Math.max(one, longestOne);
                zero = 0;
            }
        }
        return longestOne > longestZero;
    }
}
