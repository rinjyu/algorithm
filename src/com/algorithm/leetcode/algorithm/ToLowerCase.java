package com.algorithm.leetcode.algorithm;

public class ToLowerCase {

    public static void main(String[] args) {
        String s = "Hello";
//        String s = "here";
//        String s = "LOVELY";
        String result = toLowerCase(s);
        System.out.println(result);
    }

    public static String toLowerCase(String s) {
        char[] result = s.toCharArray();
        for(int i = 0; i < result.length; i++) {
            if (result[i] >= 'A' && result[i] <= 'Z') {
                result[i] += 32;
            }
        }
        return new String(result);
    }
}
