package com.algorithm.leetcode.algorithm;

public class ThousandSeparator {

    public static void main(String[] args) {
        int n = 987;
//        int n = 1234;
        String result = thousandSeparator(n);
        System.out.println(result);
    }

    public static String thousandSeparator(int n) {
        StringBuilder result = new StringBuilder(String.valueOf(n));
        for (int i = result.length() - 3; i > 0; i -= 3) {
            result.insert(i, ".");
        }
        return result.toString();
    }
}
