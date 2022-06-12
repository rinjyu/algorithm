package com.algorithm.leetcode.algorithm;

public class FindTheDifference {

    public static void main(String[] args) {
        String s = "abcd";
        String t = "abcde";
//        String s = "";
//        String t = "y";
        char result = findTheDifference(s, t);
        System.out.println(result);
    }

    public static char findTheDifference(String s, String t) {
        int result = 0;
        for (char c : s.toCharArray()) {
            result ^= c;
        }
        for (char c : t.toCharArray()) {
            result ^= c;
        }
        return (char) result;
    }
}
