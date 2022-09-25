package com.algorithm.leetcode.algorithm;

public class CheckString {

    public static void main(String[] args) {
        String s = "aaabbb";
//        String s = "abab";
//        String s = "bbb";
        boolean result = checkString(s);
        System.out.println(result);
    }

    public static boolean checkString(String s) {
        return !s.contains("ba");
    }
}
