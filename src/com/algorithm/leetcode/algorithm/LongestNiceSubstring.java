package com.algorithm.leetcode.algorithm;

import java.util.HashSet;
import java.util.Set;

public class LongestNiceSubstring {

    public static void main(String[] args) {
        String s = "YazaAay";
//        String s = "Bb";
//        String s = "C";
        String result = longestNiceSubstring(s);
        System.out.println(result);
    }

    public static String longestNiceSubstring(String s) {
        Set<Character> set = new HashSet<>();
        char[] chars = s.toCharArray();
        for (char c : chars) {
            set.add(c);
        }
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (!set.contains(Character.toUpperCase(c)) ||
                    !set.contains(Character.toLowerCase(c))) {
                String first = longestNiceSubstring(s.substring(0, i));
                String last = longestNiceSubstring(s.substring(i + 1));
                return first.length() >= last.length() ? first : last;
            }
        }
        return s;
    }
}
