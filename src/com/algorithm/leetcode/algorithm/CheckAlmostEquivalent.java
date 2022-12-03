package com.algorithm.leetcode.algorithm;

public class CheckAlmostEquivalent {

    public static void main(String[] args) {
        String word1 = "aaaa";
        String word2 = "bccb";
//        String word1 = "abcdeef";
//        String word2 = "abaaacc";
        boolean result = checkAlmostEquivalent(word1, word2);
        System.out.println(result);
    }

    public static boolean checkAlmostEquivalent(String word1, String word2) {
        int[] result = new int[26];
        for (int i = 0; i < word1.length(); i++) {
            result[word1.charAt(i) - 'a']++;
        }
        for (int i = 0; i < word2.length(); i++) {
            result[word2.charAt(i) - 'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if (Math.abs(result[i]) > 3) {
                return false;
            }
        }
        return true;
    }
}
