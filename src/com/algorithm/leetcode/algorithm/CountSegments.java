package com.algorithm.leetcode.algorithm;

public class CountSegments {

    public static void main(String[] args) {
        String s = "Hello, my name is John";
//        String s = "Hello";
//        String s = "";
        int result = countSegments(s);
        System.out.println(result);
    }

    public static int countSegments(String s) {
        String text = s.trim();
        if (text.isBlank()) {
            return 0;
        }
        return text.split("\\s+").length;
    }
}
