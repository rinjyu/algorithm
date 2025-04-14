package com.algorithm.leetcode.algorithm2025;

public class Subsequence {

    public static void main(String[] args) {

        String s = "abc";
        String t = "ahbgdc";
//        String s = "axc";
//        String t = "ahbgdc";
//        String s = "acb";
//        String t = "ahbgdc";
        System.out.println(isSubsequence(s, t));
    }

    public static boolean isSubsequence(String s, String t) {

        if (s.length() < 1) {
            return true;
        }

        if (t.length() < 1) {
            return false;
        }

        int i = 0;
        for (char c : t.toCharArray()) {
            if (c == s.charAt(i)) {
                i++;
            }
            if (i >= s.length()) {
                return true;
            }
        }

        return false;
    }
}
