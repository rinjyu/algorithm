package com.algorithm.leetcode.algorithm;

import java.util.HashMap;
import java.util.Map;

public class CountWords {

    public static void main(String[] args) {
        String[] words1 = {"leetcode", "is", "amazing", "as", "is"};
        String[] words2 = {"amazing", "leetcode", "is"};
//        String[] words1 = {"b", "bb", "bbb"};
//        String[] words2 = {"a", "aa", "aaa"};
//        String[] words1 = {"a", "ab"};
//        String[] words2 = {"a", "a", "a", "ab"};
        int result = countWords(words1, words2);
        System.out.println(result);
    }

    public static int countWords(String[] words1, String[] words2) {
        Map<String, Integer> map = new HashMap<>();
        for (String w : words1) {
            map.put(w, map.getOrDefault(w, 0) + 1);
        }
        for (String w : words2) {
            int count = map.getOrDefault(w, 0);
            if (map.containsKey(w) && count < 2) {
                map.put(w, count - 1);
            }
        }
        int result = 0;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 0) {
                result++;
            }
        }
        return result;
    }
}
