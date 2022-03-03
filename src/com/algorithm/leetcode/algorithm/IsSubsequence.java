package com.algorithm.leetcode.algorithm;

import java.util.Objects;

public class IsSubsequence {

    public static void main(String[] args) {
        String s = "abc";
        String t = "ahbgdc";
//        String s = "axc";
//        String t = "ahbgdc";
//        String s = "";
//        String t = "ahbgdc";
//        String s = "acb";
//        String t = "ahbgdc";
        boolean result = isSubsequence(s, t);
        System.out.println(result);
    }

    public static boolean isSubsequence(String s, String t) {
        if (isValidLength("s", s)) {
            return false;
        }
        if (isValidLength("t", t)) {
            return false;
        }
        StringBuilder stringBuilder = new StringBuilder();
        int i = 0;
        for (int j = 0; j < t.length() && i < s.length(); j++) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
                stringBuilder.append(t.charAt(j));
            }
        }
        return Objects.equals(s, stringBuilder.toString());
    }

    private static boolean isValidLength(String type, String text) {
        if ("s".equals(type)) {
            return text.length() > 100;
        } else {
            return text.length() > 10000;
        }
    }
}