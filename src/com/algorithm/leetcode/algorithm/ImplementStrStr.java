package com.algorithm.leetcode.algorithm;

import java.util.Objects;

public class ImplementStrStr {

    public static void main(String[] args) {
        String haystack = "hello";
        String needle = "ll";
//        String haystack = "aaaaa";
//        String needle = "bba";
//        String haystack = "";
//        String needle = "";
//        String haystack = "";
//        String needle = "a";
        int result = strStr(haystack, needle);
        System.out.println(result);
    }

    public static int strStr(String haystack, String needle) {
        if (Objects.isNull(needle)) {
            return 0;
        }
        if (!isValidNeedle(needle)) {
            return -1;
        }
        if (Objects.isNull(haystack)) {
            return -1;
        }
        return haystack.indexOf(needle);
    }

    public static boolean isValidNeedle(String s) {
        return s.length() <= 50000;
    }
}
