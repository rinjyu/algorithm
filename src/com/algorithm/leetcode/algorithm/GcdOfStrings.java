package com.algorithm.leetcode.algorithm;

public class GcdOfStrings {

    public static void main(String[] args) {
        String str1 = "ABCABC";
        String str2 = "ABC";
//        String str1 = "ABABAB";
//        String str2 = "ABAB";
//        String str1 = "LEET";
//        String str2 = "ABC";
        String result = gcdOfStrings(str1, str2);
        System.out.println(result);
    }

    public static String gcdOfStrings(String str1, String str2) {
        if (str1.length() < str2.length()) {
            String temp = str1;
            str1 = str2;
            str2 = temp;
        }
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }
        int length = gcd(str1.length(), str2.length());
        return str1.substring(0, length);
    }

    private static int gcd(int num1, int num2) {
        while (num2 != 0) {
            int temp = num1 % num2;
            num1 = num2;
            num2 = temp;
        }
        return num1;
    }
}
