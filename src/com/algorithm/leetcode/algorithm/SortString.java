package com.algorithm.leetcode.algorithm;

public class SortString {

    public static void main(String[] args) {
        String s = "aaaabbbbcccc";
//        String s = "rat";
        String result = sortString(s);
        System.out.println(result);
    }

    public static String sortString(String s) {
        int length = s.length();
        int[] count = new int[26];
        StringBuilder result = new StringBuilder();
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }
        while (length > 0) {
            for (int i = 0; i < 26 && length > 0; i++) {
                if (count[i] > 0) {
                    count[i]--;
                    result.append((char) ('a' + i));
                    length--;
                }
            }
            for (int i = 25; i >= 0 && length > 0; i--) {
                if (count[i] > 0) {
                    count[i]--;
                    result.append((char) ('a' + i));
                    length--;
                }
            }
        }
        return result.toString();
    }
}
