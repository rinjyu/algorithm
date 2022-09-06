package com.algorithm.leetcode.algorithm;

public class RemovePalindromeSub {

    public static void main(String[] args) {
//        String s = "ababa";
        String s = "abb";
        int result = removePalindromeSub(s);
        System.out.println(result);
    }

    public static int removePalindromeSub(String s) {
        int length = s.length();
        for (int i = 0; i < length / 2; i++) {
            if (s.charAt(i) != s.charAt(length - i - 1)) {
                return 2;
            }
        }
        return 1;
    }
}
