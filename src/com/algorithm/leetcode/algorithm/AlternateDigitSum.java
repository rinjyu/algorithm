package com.algorithm.leetcode.algorithm;

public class AlternateDigitSum {

    public static void main(String[] args) {
        int n = 521;
//        int n = 111;
//        int n = 886996;
        int result = alternateDigitSum(n);
        System.out.println(result);
    }

    public static int alternateDigitSum(int n) {
        String s = String.valueOf(n);
        int factor = 1;
        int result = 0;
        for (char chr : s.toCharArray()) {
            result += (Character.getNumericValue(chr) * factor);
            factor *= -1;
        }
        return result;
    }
}
