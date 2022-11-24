package com.algorithm.leetcode.algorithm;

public class CountBinarySubstrings {

    public static void main(String[] args) {
        String s = "00110011";
//        String s = "10101";
        int result = countBinarySubstrings(s);
        System.out.println(result);
    }

    public static int countBinarySubstrings(String s) {
        int prev = 0;
        int current = 1;
        int count = 0;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                current++;
            } else {
                prev = current;
                current = 1;
            }
            if (prev >= current) {
                count++;
            }
        }
        return count;
    }
}
