package com.algorithm.leetcode.algorithm;

public class ValidNumber {

    public static void main(String[] args) {
        String s = "0";
//        String s = "e";
//        String s = ".";
//        String s = "-0.1";
//        String s = "-+3";
//        String s = "--6";
//        String s = "99e2.5";
//        String s = "53.5e93";
//        String s = "3e+7";
        boolean result = isNumber(s);
        System.out.println(result);
    }

    public static boolean isNumber(String s) {
        if (!isValidString(s)) {
            return false;
        }
        boolean isDecimal = false;
        boolean hasDot = false;
        boolean hasEe = false;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                isDecimal = true;
            } else if (c == '+' || c == '-') {
                if (i > 0 && s.charAt(i - 1) != 'E' && s.charAt(i - 1) != 'e') {
                    return false;
                }
            } else if (c == '.') {
                if (hasDot || hasEe) {
                    return false;
                }
                hasDot = true;
            } else if (c == 'E' || c == 'e') {
                if (!isDecimal || hasEe) {
                    return false;
                }
                hasEe = true;
                isDecimal = false;
            } else {
                return false;
            }
        }
        return isDecimal;
    }

    private static boolean isValidString(String s) {
        return !s.isBlank() && s.length() >= 1 && s.length() <= 20;
    }
}