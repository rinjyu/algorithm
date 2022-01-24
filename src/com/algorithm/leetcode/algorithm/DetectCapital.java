package com.algorithm.leetcode.algorithm;

public class DetectCapital {

    public static void main(String[] args) {
        String word = "USA";
//        String word = "leetcode";
//        String word = "Google";
//        String word = "FlaG";
//        String word = "g";
        boolean result = detectCapitalUse(word);
        System.out.println(result);
    }

    public static boolean detectCapitalUse(String word) {
        if (!isValidLength(word)) {
            return false;
        }
        return word.matches("[A-Z]*|.[a-z]*");
    }

    public static boolean isValidLength(String word) {
        return word.length() >= 1 && word.length() <= 100;
    }

}
