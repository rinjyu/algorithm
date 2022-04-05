package com.algorithm.leetcode.algorithm;

import java.math.BigInteger;

public class AddBinary {

    public static void main(String[] args) {
        String a = "11";
        String b = "1";
//        String a = "1010";
//        String b = "1011";
        String result = addBinary(a, b);
        System.out.println(result);
    }

    public static String addBinary(String a, String b) {
        if (!isValidString(a)) {
            return "";
        }
        if (!isValidString(b)) {
            return "";
        }
        return new BigInteger(a, 2).add(new BigInteger(b, 2)).toString(2);
    }

    private static boolean isValidString(String s) {
        return !s.isBlank() && s.length() >= 1 && s.length() <= 10000;
    }
}