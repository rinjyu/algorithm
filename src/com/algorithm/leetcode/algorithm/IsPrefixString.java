package com.algorithm.leetcode.algorithm;

public class IsPrefixString {

    public static void main(String[] args) {
        String s = "iloveleetcode";
        String[] words = {"i", "love", "leetcode", "apples"};
//        String s = "iloveleetcode";
//        String[] words = {"apples", "i", "love", "leetcode"};
        boolean result = isPrefixString(s, words);
        System.out.println(result);
    }

    public static boolean isPrefixString(String s, String[] words) {
        String text = "";
        for (int i = 0; i < words.length; i++) {
            if (s.indexOf(words[i]) == -1) {
                return false;
            }
            text += words[i];
            if (s.equals(text)) {
                return true;
            }
        }
        return false;
    }
}
