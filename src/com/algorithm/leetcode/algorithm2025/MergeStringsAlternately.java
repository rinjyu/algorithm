package com.algorithm.leetcode.algorithm2025;

public class MergeStringsAlternately {

    public static void main(String[] args) {
        String word1 = "abc";
        String word2 = "pqr";
//        String word1 = "ab";
//        String word2 = "pqrs";
//        String word1 = "abcd";
//        String word2 = "pq";
        System.out.println(mergeString(word1, word2));
    }

    private static String mergeString(String word1, String word2) {

        int maxLength = word1.length() + word2.length();
        String format = "%-" + maxLength + "s";
        word1 = String.format(format, word1).replace(" ", "0");
        word2 = String.format(format, word2).replace(" ", "0");

        String[] arrayWord1 = word1.split("");
        String[] arrayWord2 = word2.split("");
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < maxLength; i++) {
            if (!"0".equals(arrayWord1[i])) {
                result.append(arrayWord1[i]);
            }
            if (!"0".equals(arrayWord2[i])) {
                result.append(arrayWord2[i]);
            }
        }

        return result.toString();
    }
}
