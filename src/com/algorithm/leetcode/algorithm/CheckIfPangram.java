package com.algorithm.leetcode.algorithm;

public class CheckIfPangram {

    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
//        String sentence = "leetcode";
        boolean result = checkIfPangram(sentence);
        System.out.println(result);
    }

    public static boolean checkIfPangram(String sentence) {
        if (sentence.length() < 26) {
            return false;
        }
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        for (char c : alphabet.toCharArray()) {
            if (sentence.indexOf(c) < 0) {
                return false;
            }
        }
        return true;
    }
}
