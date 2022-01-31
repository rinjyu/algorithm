package com.algorithm.leetcode.algorithm;

public class RegularExpressionMatching {

    public static void main(String[] args) {
        String s = "aa";
        String p = "a";
//        String s = "aa";
//        String p = "a*";
//        String s = "ab";
//        String p = ".*";
        boolean result = isMatch(s, p);
        System.out.println(result);
    }

    public static boolean isMatch(String s, String p) {
        if (p.isEmpty()) return s.isEmpty();
        boolean firstMatch = (!s.isEmpty()) && (s.charAt(0) == p.charAt(0) || p.charAt(0) == '.');
        if (p.length() >= 2 && p.charAt(1) == '*') {
            return (firstMatch && isMatch(s.substring(1), p)) || isMatch(s, p.substring(2));
        } else {
            return firstMatch && isMatch(s.substring(1), p.substring(1));
        }
    }
}
