package com.algorithm.leetcode.algorithm;

public class IsPrefixOfWord {

    public static void main(String[] args) {
        String sentence = "i love eating burger";
        String searchWord = "burg";
//        String sentence = "i am tired";
//        String searchWord = "you";
        int result = isPrefixOfWord(sentence, searchWord);
        System.out.println(result);
    }

    public static int isPrefixOfWord(String sentence, String searchWord) {
        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].indexOf(searchWord) == 0) {
                return i + 1;
            }
        }
        return -1;
    }
}
