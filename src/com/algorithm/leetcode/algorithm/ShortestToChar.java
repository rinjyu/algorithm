package com.algorithm.leetcode.algorithm;

import java.util.Arrays;

public class ShortestToChar {

    public static void main(String[] args) {
        String s = "loveleetcode";
        char c = 'e';
//        String s = "aaab";
//        char c = 'b';
        int[] result = shortestToChar(s, c);
        System.out.println(Arrays.toString(result));
    }

    public static int[] shortestToChar(String s, char c) {
        int length = s.length();
        int[] result = new int[length];
        int previous = length;

        int i = 0;
        for (char ch : s.toCharArray()) {
            if (ch == c) {
                previous = 0;
                result[i] = 0;
            } else {
                result[i] = ++previous;
            }
            i++;
        }
        i = length - 1;
        previous = length;
        while (i >= 0) {
            if (s.charAt(i) == c) {
                previous = 0;
                result[i] = Math.min(result[i], 0);
            } else {
                result[i] = Math.min(result[i], ++previous);
            }
            i--;
        }
        return result;
    }
}
