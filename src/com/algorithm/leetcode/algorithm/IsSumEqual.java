package com.algorithm.leetcode.algorithm;

public class IsSumEqual {

    public static void main(String[] args) {
        String firstWord = "acb";
        String secondsWord = "cba";
        String targetWord = "cdb";
//        String firstWord = "aaa";
//        String secondsWord = "a";
//        String targetWord = "aab";
//        String firstWord = "aaa";
//        String secondsWord = "a";
//        String targetWord = "aaaa";
        boolean result = isSumEqual(firstWord, secondsWord, targetWord);
        System.out.println(result);
    }

    public static boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        return getValue(firstWord) + getValue(secondWord) == getValue(targetWord);
    }

    private static int getValue(String word) {
        int result = 0;
        for (char c : word.toCharArray()) {
            result = result * 10 + (c - 'a');
        }
        return result;
    }
}
