package com.algorithm.leetcode.algorithm;

public class LongestPalindrome {

    public static void main(String[] args) {
        String s = "babad";
//        String s = "cbbd";
        String result = longestPalindrome(s);
        System.out.println("result={}" + result);
    }

    public static String longestPalindrome(String s) {
        if (!isValidString(s)) {
            return "";
        }

        if (s.length() == 1) {
            return s;
        }

        int start = 0;
        int maxLength = 0;
        for (int i = 0; i < s.length(); i++) {
            int length1 = expandAroundCenter(s, i, i);
            int length2 = expandAroundCenter(s, i, i + 1);
            int currentLength = Math.max(length1, length2);
            if (currentLength > maxLength) {
                maxLength = currentLength;
                start = i - (currentLength - 1) / 2;
            }
        }
        return s.substring(start, start + maxLength);
    }

    public static boolean isValidString(String s) {
        return s.length() >= 1 && s.length() <= 1000;
    }

    public static int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }
}
