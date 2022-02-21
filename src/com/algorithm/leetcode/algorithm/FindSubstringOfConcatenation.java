package com.algorithm.leetcode.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class FindSubstringOfConcatenation {

    public static void main(String[] args) {
        String s = "barfoothefoobarman";
        String[] words = {"foo", "bar"};
//        String s = "wordgoodgoodgoodbestword";
//        String[] words = {"word","good","best","word"};
//        String s = "barfoofoobarthefoobarman";
//        String[] words = {"bar","foo","the"};
//        String s = "wordgoodgoodgoodbestword";
//        String[] words = {"word","good","best","good"};
        List<Integer> result = findSubstring(s, words);
        System.out.println(Arrays.toString(Objects.requireNonNull(result).toArray()));
    }

    public static List<Integer> findSubstring(String s, String[] words) {
        if (!isValidText(s)) {
            return null;
        }
        if (!isValidArray(words)) {
            return null;
        }
        List<Integer> result = new ArrayList<>();
        int textLength = s.length();
        int wordsLength = words.length;
        int size = words[0].length();
        int wordLength = wordsLength * size;
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        for (int i = 0; i <= textLength - wordLength; i++) {
            String current = s.substring(i, i + wordLength);
            if (isValidElement(current, map, size)) {
                result.add(i);
            }
        }
        return result;
    }

    public static boolean isValidText(String s) {
        return !s.isBlank() && s.length() >= 1 && s.length() <= 10000;
    }

    public static boolean isValidArray(String[] words) {
        return !Objects.isNull(words) && words.length >= 1 && words.length <= 5000;
    }

    public static boolean isValidElement(String text, Map<String, Integer> map, int size) {
        Map<String, Integer> currentMap = new HashMap<>(map);
        for (int i = 0; i <= text.length() - size; i += size) {
            String current = text.substring(i, i + size);
            int value = currentMap.getOrDefault(current, 0) - 1;
            if (value < 0) {
                return false;
            } else if (value == 0) {
                currentMap.remove(current);
            } else {
                currentMap.put(current, value);
            }
        }
        return currentMap.isEmpty();
    }
}
