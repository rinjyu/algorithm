package com.algorithm.leetcode.algorithm2025;

public class GcdOfString {

    public static void main(String[] args) {

        String str1 = "ABCABC";
        String str2 = "ABC";
//        String str1 = "ABCDEF";
//        String str2 = "ABC";
//        String str1 = "LEET";
//        String str2 = "CODE";
        System.out.println(gcdOfStrings(str1, str2));
    }

    public static String gcdOfStrings(String str1, String str2) {
        int gcdLength = getGcdLength(str1.length(), str2.length());
        String candidate = str1.substring(0, gcdLength);
        if (isDivisible(str1, candidate) && isDivisible(str2, candidate)) {
            return candidate;
        }

        return "";
    }

    private static int getGcdLength(int length1, int length2) {
        return length2 == 0 ? length1 : getGcdLength(length2, length1 % length2);
    }

    private static boolean isDivisible(String str, String pattern) {
        int len = str.length();
        int patLen = pattern.length();

        if (len % patLen != 0) {
            return false;
        }

        StringBuilder repeated = new StringBuilder();
        for (int i = 0; i < len / patLen; i++) {
            repeated.append(pattern);
        }

        return str.equals(repeated.toString());
    }
}
