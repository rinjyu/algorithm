package com.algorithm.leetcode.algorithm;

public class IsCircularSentence {

    public static void main(String[] args) {
        String sentence = "leetcode exercises sound delightful";
//        String sentence = "eetcode";
//        String sentence = "Leetcode is cool";
        boolean result = isCircularSentence(sentence);
        System.out.println(result);
    }

    public static boolean isCircularSentence(String sentence) {
        String[] sentences = sentence.split(" ");
        if (sentence.charAt(0) != sentence.charAt(sentence.length() - 1)) {
            return false;
        }
        for (int i = 0; i < sentences.length - 1; i++) {
            if (sentences[i].charAt(sentences[i].length() - 1) != sentences[i + 1].charAt(0)) {
                return false;
            }
        }
        return true;
    }
}
