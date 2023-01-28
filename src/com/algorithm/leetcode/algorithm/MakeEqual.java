package com.algorithm.leetcode.algorithm;

import java.util.HashMap;
import java.util.Map;

public class MakeEqual {

    public static void main(String[] args) {
        String[] words = {"abc", "aabc", "bc"};
//        String[] words = {"ab", "a"};
        boolean result = makeEqual(words);
        System.out.println(result);
    }

    public static boolean makeEqual(String[] words) {
        Map<Character, Integer> map = new HashMap<>();
        for (String word : words) {
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
        }
        for (Character c : map.keySet()) {
            int k = map.get(c);
            if (k % words.length != 0) {
                return false;
            }
        }
        return true;
    }
}
