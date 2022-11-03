package com.algorithm.leetcode.algorithm;

import java.util.HashMap;
import java.util.Map;

public class CountCharacters {

    public static void main(String[] args) {
        String[] words = {"cat", "bt", "hat", "tree"};
        String chars = "atach";
//        String[] words = {"hello", "world", "leetcode"};
//        String chars = "welldonehoneyr";
        int result = countCharacters(words, chars);
        System.out.println(result);
    }

    public static int countCharacters(String[] words, String chars) {
        Map<Character, Integer> map = new HashMap<>();
        int result = 0;
        for (char c : chars.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (String w : words) {
            int i = 0;
            Map<Character, Integer> tempMap = new HashMap<>();
            for (char c : w.toCharArray()) {
                if (map.containsKey(c)) {
                    if (tempMap.containsKey(c) && tempMap.get(c) + 1 > map.get(c)) {
                        break;
                    }
                    tempMap.put(c, tempMap.getOrDefault(c, 0) + 1);
                } else {
                    break;
                }
                i++;
            }
            if (i == w.length()) {
                result += w.length();
            }
        }
        return result;
    }
}
