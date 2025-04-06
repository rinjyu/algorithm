package com.algorithm.leetcode.algorithm2025;

public class LongestCommonSubsequence {

    public static void main(String[] args) {

//        String text1 = "abcde";
//        String text2 = "ace";
//        String text1 = "abc";
//        String text2 = "abc";
//        String text1 = "abc";
//        String text2 = "def";
        String text1 = "ezupkr";
        String text2 = "ubmrapg";
        System.out.println(longestCommonSubsequence(text1, text2));
    }

    public static int longestCommonSubsequence(String text1, String text2) {

        if (text1.length() > text2.length()) {
            String temp = text1;
            text1 = text2;
            text2 = temp;
        }

        int length1 = text1.length();
        int length2 = text2.length();
        int[] previous = new int[length2 + 1];
        int[] current = new int[length2 + 1];

        for (int i = 1; i <= length1; i++) {
            for (int j = 1; j <= length2; j++) {
                if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                    current[j] = previous[j - 1] + 1;
                } else {
                    current[j] = Math.max(previous[j], current[j - 1]);
                }
            }

            int[] temp = previous;
            previous = current;
            current = temp;
        }

        return previous[length2];
    }
}
