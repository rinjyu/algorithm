package com.algorithm.leetcode.algorithm;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {

    public static void main(String[] args) {
        String pattern = "abba";
        String s = "dog cat cat dog";
//        String pattern = "abba";
//        String s = "dog cat cat fish";
//        String pattern = "aaaa";
//        String s = "dog cat cat dog";
        boolean result = wordPattern(pattern, s);
        System.out.println(result);
    }

    public static boolean wordPattern(String pattern, String s) {
        String[] textArray = s.split(" ");
        if (pattern.length() != textArray.length) {
            return false;
        }
        int i = 0;
        Map<Character, String> checkedMap = new HashMap<>();
        for (char c : pattern.toCharArray()) {
            if (checkedMap.containsKey(c)) {
                if (!checkedMap.get(c).equals(textArray[i])) {
                    return false;
                }
            } else if (checkedMap.containsValue(textArray[i])) {
                return false;
            } else {
                checkedMap.put(c, textArray[i]);
            }
            i++;
        }
        return true;
    }
}
