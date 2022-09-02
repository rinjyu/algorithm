package com.algorithm.leetcode.algorithm;

import java.util.HashMap;
import java.util.Map;

public class AreOccurrencesEqual {

    public static void main(String[] args) {
        String s = "abacbc";
//        String s = "aaabb";
        boolean result = areOccurrencesEqual(s);
        System.out.println(result);
    }

    public static boolean areOccurrencesEqual(String s) {
        if (s.length() == 1) {
            return true;
        }
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int value = map.get(s.charAt(0));
        for (char c : map.keySet()) {
            if (map.get(c) != value) {
                return false;
            }
        }
        return true;
    }
}
