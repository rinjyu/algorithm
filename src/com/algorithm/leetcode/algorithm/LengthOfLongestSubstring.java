package com.algorithm.leetcode.algorithm;

import java.util.HashMap;
import java.util.Map;

public class LengthOfLongestSubstring {

    public static void main(String[] args) {
        String s = "abcabcbb";
//        String s = "bbbbb";
//        String s = "pwwkew";
//        String s = "";
//        String s = "au";
//        String s = " ";
        int max = lengthOfLongestSubstring(s);
        System.out.println(max);
    }

    public static int lengthOfLongestSubstring(String s) {
        if (!isValidText(s)) {
            return -1;
        }

        Map<Character, Integer> point = new HashMap<>();
        int max = 0;
        int start = 0;
        for (int i = 0; i < s.length(); i++) {
            Character character = s.charAt(i);

            if (point.containsKey(character) && point.get(character) >= start) {
                start = point.get(character) + 1;
            }

            point.put(character, i);

            if ((i - start + 1) > max) {
                max = i - start + 1;
            }
        }

        return max;
    }

    public static boolean isValidText(String s) {
        return s.length() <= 50000;
    }
}
