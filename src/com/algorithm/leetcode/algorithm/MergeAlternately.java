package com.algorithm.leetcode.algorithm;

public class MergeAlternately {

    public static void main(String[] args) {
        String word1 = "abc";
        String word2 = "pqr";
//        String word1 = "ab";
//        String word2 = "pqrs";
//        String word1 = "abcd";
//        String word2 = "pq";
        String result = mergeAlternately(word1, word2);
        System.out.println(result);
    }

    public static String mergeAlternately(String word1, String word2) {
        String[] words1 = word1.split("");
        String[] words2 = word2.split("");
        int length = Math.max(word1.length(), word2.length());
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < length; i++) {
            if (i < word1.length()) {
                result.append(words1[i]);
            }
            if (i < word2.length()) {
                result.append(words2[i]);
            }
        }
        return result.toString();
    }
}
