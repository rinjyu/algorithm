package com.algorithm.leetcode.algorithm;

import java.util.HashSet;
import java.util.Set;

public class LongestPalindrome2 {

    public static void main(String[] args) {
        String s = "abccccdd";
//        String s = "a";
        int result = longestPalindrome(s);
        System.out.println(result);
    }

    public static int longestPalindrome(String s) {
        if (s.isEmpty()) {
            return 0;
        }
        Set<Character> set = new HashSet<>();
        int count = 0;
        for (char c : s.toCharArray()) {
            if (set.contains(c)) {
                set.remove(c);
                count++;
            } else {
                set.add(c);
            }
        }
        if (!set.isEmpty()) {
            return count * 2 + 1;
        }
        return count * 2;
    }
}
