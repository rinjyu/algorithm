package com.algorithm.leetcode.algorithm;

public class CanBeTypedWords {

    public static void main(String[] args) {
        String text = "hello world";
        String brokenLetters = "ad";
//        String text = "leet code";
//        String brokenLetters = "lt";
//        String text = "leet code";
//        String brokenLetters = "e";
        int result = canBeTypedWords(text, brokenLetters);
        System.out.println(result);
    }

    public static int canBeTypedWords(String text, String brokenLetters) {
        int count = 0;
        for (String w : text.split(" ")) {
            boolean isContains = true;
            for (char c : brokenLetters.toCharArray()) {
                if (w.indexOf(c)> -1) {
                    isContains = false;
                    break;
                }
            }
            if (isContains) {
                count++;
            }
        }
        return count;
    }
}
