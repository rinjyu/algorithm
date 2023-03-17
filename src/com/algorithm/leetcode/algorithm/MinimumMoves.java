package com.algorithm.leetcode.algorithm;

public class MinimumMoves {

    public static void main(String[] args) {
        String s = "XXX";
//        String s = "XXOX";
//        String s = "OOOO";
        int result = minimumMoves(s);
        System.out.println(result);
    }

    public static int minimumMoves(String s) {
        int i = 0;
        int count = 0;
        while (i < s.length()) {
            if (s.charAt(i) == 'X') {
                i = i + 3;
                count++;
            } else {
                i++;
            }
        }
        return count;
    }
}
