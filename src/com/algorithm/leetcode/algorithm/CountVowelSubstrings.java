package com.algorithm.leetcode.algorithm;

import java.util.HashSet;
import java.util.Set;

public class CountVowelSubstrings {

    public static void main(String[] args) {
        String word = "aeiouu";
//        String word = "unicornarihan";
//        String word = "cuaieuouac";
        int result = countVowelSubstrings(word);
        System.out.println(result);
    }

    public static int countVowelSubstrings(String word) {
        int count = 0;
        int length = word.length();
        Set<Character> set;
        for (int i = 0; i < length - 4; i++) {
            set = new HashSet<>();
            for (int j = i; j < length; j++) {
                char c = word.charAt(j);
                if (!isVowel(c)) {
                    break;
                }
                set.add(c);
                if (set.size() == 5) {
                    count++;
                }
            }
        }
        return count;
    }

    private static boolean isVowel(char c) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            return true;
        }
        return false;
    }
}
