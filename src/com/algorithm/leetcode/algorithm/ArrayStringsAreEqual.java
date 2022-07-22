package com.algorithm.leetcode.algorithm;

public class ArrayStringsAreEqual {

    public static void main(String[] args) {
        String[] word1 = {"ab", "c"};
        String[] word2 = {"a", "bc"};
//        String[] word1 = {"a", "cb"};
//        String[] word2 = {"ab", "c"};
//        String[] word1 = {"abc", "d", "defg"};
//        String[] word2 = {"abcddefg"};
        boolean result = arrayStringsAreEqual(word1, word2);
        System.out.println(result);
    }

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String addWord1 = String.join("", word1);
        String addWord2 = String.join("", word2);
        return addWord1.equals(addWord2);
    }
}
