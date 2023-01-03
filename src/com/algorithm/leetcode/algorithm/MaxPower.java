package com.algorithm.leetcode.algorithm;

public class MaxPower {

    public static void main(String[] args) {
        String s = "leetcode";
//        String s = "abbcccddddeeeeedcba";
        int result = maxPower(s);
        System.out.println(result);
    }

    public static int maxPower(String s) {
        int result = 1;
        int count = 1;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                count++;
            } else {
                result = Math.max(result, count);
                count = 1;
            }
        }
        return Math.max(result, count);
    }
}
