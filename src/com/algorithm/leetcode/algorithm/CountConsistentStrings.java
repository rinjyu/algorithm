package com.algorithm.leetcode.algorithm;

public class CountConsistentStrings {

    public static void main(String[] args) {
        String allowed = "ab";
        String[] words = {"ad", "bd", "aaab", "baa", "badab"};
//        String allowed = "abc";
//        String[] words = {"a", "b", "c", "ab", "ac", "bc", "abc"};
//        String allowed = "cad";
//        String[] words = {"cc", "acd", "b", "ba", "bac", "bad", "ac", "d"};
        int result = countConsistentStrings(allowed, words);
        System.out.println(result);
    }

    public static int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        for (String s : words) {
            boolean isValid = true;
            for (char c : s.toCharArray()) {
                if (!allowed.contains(String.valueOf(c))) {
                    isValid = false;
                }
            }
            if (isValid) {
                count++;
            }
        }
        return count;
    }
}
