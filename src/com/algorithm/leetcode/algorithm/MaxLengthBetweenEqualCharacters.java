package com.algorithm.leetcode.algorithm;

import java.util.HashMap;
import java.util.Map;

public class MaxLengthBetweenEqualCharacters {

    public static void main(String[] args) {
        String s = "aa";
//        String s = "abca";
//        String s = "cbzxy";
        int result = maxLengthBetweenEqualCharacters(s);
        System.out.println(result);
    }

    public static int maxLengthBetweenEqualCharacters(String s) {
        int result = -1;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                result = Math.max(result, i - map.get(c) - 1);
            } else {
                map.put(c, i);
            }
        }
        return result;
    }
}
