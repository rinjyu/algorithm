package com.algorithm.leetcode.algorithm;

import java.util.*;

public class KeyboardRow {

    public static void main(String[] args) {
        String[] words = {"Hello", "Alaska", "Dad", "Peace"};
//        String[] words = {"omk"};
//        String[] words = {"adsdf", "sfd"};
        String[] result = findWords(words);
        System.out.println(Arrays.toString(result));
    }

    public static String[] findWords(String[] words) {
        String[] keys = {"qwertyuiop", "asdfghjkl", "zxcvbnm"};
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < keys.length; i++) {
            for (char c : keys[i].toCharArray()) {
                map.put(c, i);
            }
        }
        List<String> result = new LinkedList<>();
        for (String w : words) {
            if (!"".equals(w)) {
                int i = map.get(w.toLowerCase().charAt(0));
                for (char c : w.toLowerCase().toCharArray()) {
                    if (map.get(c) != i) {
                        i = -1;
                        break;
                    }
                }
                if (i != -1) {
                    result.add(w);
                }
            }
        }
        return result.toArray(new String[0]);
    }
}
