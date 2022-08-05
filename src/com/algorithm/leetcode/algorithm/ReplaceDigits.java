package com.algorithm.leetcode.algorithm;

public class ReplaceDigits {

    public static void main(String[] args) {
        String s = "a1c1e1";
//        String s = "a1b2c3d4e";
        String result = replaceDigits(s);
        System.out.println(result);
    }

    public static String replaceDigits(String s) {
        char[] chars = s.toCharArray();
        for (int i = 1; i < chars.length; i += 2) {
            chars[i] += chars[i - 1] - '0';
        }
        return new String(chars);
    }
}
