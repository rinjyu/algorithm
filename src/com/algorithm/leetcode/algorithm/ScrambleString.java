package com.algorithm.leetcode.algorithm;

import java.util.HashMap;
import java.util.Map;

public class ScrambleString {

    public static void main(String[] args) {
        String s1 = "great";
        String s2 = "rgeat";
//        String s1 = "a";
//        String s2 = "a";
        boolean result = isScramble(s1, s2);
        System.out.println(result);
    }

    public static boolean isScramble(String s1, String s2) {
        Map<String, Boolean> map = new HashMap<>();
        return backtracking(s1, s2, map);
    }

    private static boolean backtracking(String s1, String s2, Map<String, Boolean> map) {
        int size = s1.length();
        if (size == 1) {
            return s1.equals(s2);
        }

        String match = s1 + "-" + s2;
        if (map.containsKey(match)) {
            return map.get(match);
        }

        char[] chars1 = s1.toCharArray();
        char[] chars2 = s2.toCharArray();
        int[] count1 = new int[26];
        int[] count2 = new int[26];
        for (int i = 0; i < size; i++) {
            count1[chars1[i] - 'a']++;
            count2[chars2[i] - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (count1[i] != count2[i]) {
                map.put(match, false);
                return map.get(match);
            }
        }
        for (int i = 1; i < size; i++) {
            String text1 = s1.substring(0, i);
            String text2 = s1.substring(i, size);
            if ((backtracking(text1, s2.substring(0, i), map) && backtracking(text2, s2.substring(i, size), map)) || (backtracking(text1, s2.substring(size - i, size), map) && backtracking(text2, s2.substring(0, size - i), map))) {
                map.put(match, true);
                return map.get(match);
            }
        }
        map.put(match, false);
        return map.get(match);
    }
}
