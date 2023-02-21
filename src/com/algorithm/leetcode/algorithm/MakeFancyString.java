package com.algorithm.leetcode.algorithm;

public class MakeFancyString {

    public static void main(String[] args) {
        String s = "leeetcode";
//        String s = "aaabaaaa";
//        String s = "aab";
        String result = makeFancyString(s);
        System.out.println(result);
    }

    public static String makeFancyString(String s) {
        char prev = s.charAt(0);
        int count = 1;
        StringBuilder result = new StringBuilder();
        result.append(prev);
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == prev) {
                count++;
            } else {
                prev = s.charAt(i);
                count = 1;
            }
            if (count < 3) {
                result.append(s.charAt(i));
            }
        }
        return result.toString();
    }
}
