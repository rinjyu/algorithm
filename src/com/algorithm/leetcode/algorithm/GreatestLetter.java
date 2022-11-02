package com.algorithm.leetcode.algorithm;

import java.util.HashSet;
import java.util.Set;

public class GreatestLetter {

    public static void main(String[] args) {
        String s = "lEeTcOdE";
//        String s = "arRAzFif";
//        String s = "AbCdEfGhIjK";
        String result = greatestLetter(s);
        System.out.println(result);
    }

    public static String greatestLetter(String s) {
        Set<Character> set = new HashSet<>();
        for (char c : s.toCharArray()) {
            set.add(c);
        }
        for (char c = 'Z'; c >= 'A'; c--) {
            if (set.contains(c) && set.contains((char)('a'+(c - 'A')))) {
                return String.valueOf(c);
            }
        }
        return "";
    }
}
