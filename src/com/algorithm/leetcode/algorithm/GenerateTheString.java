package com.algorithm.leetcode.algorithm;

import java.util.Arrays;

public class GenerateTheString {

    public static void main(String[] args) {
        int n = 4;
        String result = generateTheString(n);
        System.out.println(result);
    }

    public static String generateTheString(int n) {
        char[] chars = new char[n];
        Arrays.fill(chars, 'a');
        if (n % 2 == 0) {
            chars[0] = 'b';
        }
        return new String(chars);
    }
}
