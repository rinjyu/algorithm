package com.algorithm.leetcode.algorithm;

import java.util.HashMap;
import java.util.Map;

public class MinWindowSubstring {

    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
//        String s = "a";
//        String t = "a";
//        String s = "a";
//        String t = "aa";
        String result = minWindow(s, t);
        System.out.println(result);
    }

    public static String minWindow(String s, String t) {
        if (s.isBlank() || t.isBlank()) {
            return "";
        }
        Map<Character, Integer> characterMap = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            int count = characterMap.getOrDefault(t.charAt(i), 0);
            characterMap.put(t.charAt(i), count + 1);
        }
        int size = characterMap.size();
        int left = 0;
        int right = 0;
        int matchedCount = 0;
        Map<Character, Integer> windowMap = new HashMap<>();
        int[] result = {-1, 0, 0};
        while (right < s.length()) {
            char c = s.charAt(right);
            int count = windowMap.getOrDefault(c, 0);
            windowMap.put(c, count + 1);
            if (characterMap.containsKey(c) && windowMap.get(c).intValue() == characterMap.get(c).intValue()) {
                matchedCount++;
            }
            while (left <= right && matchedCount == size) {
                c = s.charAt(left);
                if (result[0] == -1 || right - left + 1 < result[0]) {
                    result[0] = right - left + 1;
                    result[1] = left;
                    result[2] = right;
                }
                windowMap.put(c, windowMap.get(c) - 1);
                if (characterMap.containsKey(c) && windowMap.get(c) < characterMap.get(c)) {
                    matchedCount--;
                }
                left++;
            }
            right++;
        }
        return result[0] == -1 ? "" : s.substring(result[1], result[2] + 1);
    }
}