package com.algorithm.leetcode.algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OddString {

    public static void main(String[] args) {
        String[] words = {"adc", "wzy", "abc"};
//        String[] words = {"aaa", "bob", "ccc", "ddd"};
        String result = oddString(words);
        System.out.println(result);
    }

    public static String oddString(String[] words) {
        Map<String, List<String>> map = new HashMap<>();
        for (String word : words) {
            char[] chars = word.toCharArray();
            int diff = 'a' - chars[0];
            for (int i = 0; i < chars.length; i++) {
                chars[i] = (char) ('a' - chars[i] - diff + 97);
            }
            if (!map.containsKey(String.valueOf(chars))) {
                map.put(String.valueOf(chars), new ArrayList<>());
            }
            map.get(String.valueOf(chars)).add(word);
        }
        for (String w : map.keySet()) {
            if (map.get(w).size() == 1) {
                return map.get(w).get(0);
            }
        }
        return null;
    }
}
