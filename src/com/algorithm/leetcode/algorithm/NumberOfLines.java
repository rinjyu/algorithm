package com.algorithm.leetcode.algorithm;

import java.util.Arrays;

public class NumberOfLines {

    public static void main(String[] args) {
        int[] widths = {10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
        String s = "abcdefghijklmnopqrstuvwxyz";
        int[] result = numberOfLines(widths, s);
        System.out.println(Arrays.toString(result));
    }

    public static int[] numberOfLines(int[] widths, String s) {
        int line = 1;
        int last = 0;
        for (char c : s.toCharArray()) {
            int current = widths[c - 'a'];
            if (last + current <= 100) {
                last += current;
            } else {
                line++;
                last = current;
            }
        }
        return new int[]{line, last};
    }
}
