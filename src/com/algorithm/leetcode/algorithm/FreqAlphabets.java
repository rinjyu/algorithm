package com.algorithm.leetcode.algorithm;

public class FreqAlphabets {

    public static void main(String[] args) {
        String s = "10#11#12";
//        String s = "1326#";
        String result = freqAlphabets(s);
        System.out.println(result);
    }

    public static String freqAlphabets(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '#') {
                stringBuilder.append((char) ('a' + (s.charAt(i - 1) - '0') + 10 * (s.charAt(i - 2) - '0') - 1));
                i -= 2;
            } else {
                stringBuilder.append((char) ('a' + (s.charAt(i) - '0') - 1));
            }
        }
        return stringBuilder.reverse().toString();
    }
}
