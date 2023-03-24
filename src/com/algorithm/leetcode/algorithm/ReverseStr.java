package com.algorithm.leetcode.algorithm;

public class ReverseStr {

    public static void main(String[] args) {
        String s = "abcdefg";
        int k = 2;
//        String s = "abcd";
//        int k = 2;
        String result = reverseStr(s, k);
        System.out.println(result);
    }

    public static String reverseStr(String s, int k) {
        StringBuilder result = new StringBuilder();
        while (s.length() >= 2 * k) {
            String temp = s.substring(0, k);
            result.append(new StringBuilder(temp).reverse());
            result.append(s.substring(k, 2 * k));
            s = s.substring(2 * k);
        }
        if (s.length() <= k) {
            result.append(new StringBuilder(s).reverse());
        } else {
            result.append(new StringBuilder(s.substring(0, k)).reverse());
            result.append(s.substring(k));
        }
        return result.toString();
    }
}
