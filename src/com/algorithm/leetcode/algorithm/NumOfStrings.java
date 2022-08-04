package com.algorithm.leetcode.algorithm;

public class NumOfStrings {

    public static void main(String[] args) {
        String[] patterns = {"a", "abc", "bc", "d"};
        String word = "abc";
//        String[] patterns = {"a", "b", "c"};
//        String word = "aaaaabbbbb";
//        String[] patterns = {"a", "a", "a"};
//        String word = "ab";
        int result = numOfStrings(patterns, word);
        System.out.println(result);
    }

    public static int numOfStrings(String[] patterns, String word) {
        int count = 0;
        for (String s : patterns) {
            if (word.contains(s)) {
                count++;
            }
        }
        return count;
    }
}
