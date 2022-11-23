package com.algorithm.leetcode.algorithm;

import java.util.*;

public class UncommonFromSentences {

    public static void main(String[] args) {
        String s1 = "this apple is sweet";
        String s2 = "this apple is sour";
//        String s1 = "apple apple";
//        String s2 = "banana";
        String[] result = uncommonFromSentences(s1, s2);
        System.out.println(Arrays.toString(result));
    }

    public static String[] uncommonFromSentences(String s1, String s2) {
        Map<String, Integer> map = new HashMap<>();
        for (String s : s1.split(" ")) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        for (String s : s2.split(" ")) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        List<String> result = new ArrayList<>();
        for (String s : map.keySet()) {
            if (map.get(s) < 2) {
                result.add(s);
            }
        }
        return result.toArray(new String[result.size()]);
    }
}
