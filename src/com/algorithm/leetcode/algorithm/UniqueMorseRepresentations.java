package com.algorithm.leetcode.algorithm;

import java.util.HashSet;
import java.util.Set;

public class UniqueMorseRepresentations {

    private static String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.",
            "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};

    public static void main(String[] args) {
        String[] words = {"gin", "zen", "gig", "msg"};
//        String[] words = {"a"};
        int result = uniqueMorseRepresentations(words);
        System.out.println(result);
    }

    public static int uniqueMorseRepresentations(String[] words) {
        Set<String> set = new HashSet<>();
        for (String w : words) {
            StringBuilder stringBuilder = new StringBuilder();
            for (char c : w.toCharArray()) {
                stringBuilder.append(morse[c - 'a']);
            }
            set.add(stringBuilder.toString());
        }
        return set.size();
    }
}
