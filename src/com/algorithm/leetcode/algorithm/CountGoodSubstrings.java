package com.algorithm.leetcode.algorithm;

public class CountGoodSubstrings {

    public static void main(String[] args) {
        String s = "xyzzaz";
//        String s = "aababcabc";
        int result = countGoodSubstrings(s);
        System.out.println(result);
    }

    public static int countGoodSubstrings(String s) {
        int count = 0;
        for (int i = 0; i < s.length() - 2; i++) {
            char c1 = s.charAt(i);
            char c2 = s.charAt(i + 1);
            char c3 = s.charAt(i + 2);
            if ((c1 != c2) && (c2 != c3) && (c1 != c3)) {
                count++;
            }
        }
        return count;
    }
}
