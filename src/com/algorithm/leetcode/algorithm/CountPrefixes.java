package com.algorithm.leetcode.algorithm;

public class CountPrefixes {

    public static void main(String[] args) {
        String[] words = {"a", "b", "c", "ab", "bc", "abc"};
        String s = "abc";
//        String[] words = {"a","a"};
//        String s = "aa";
        int result = countPrefixes(words, s);
        System.out.println(result);
    }

    public static int countPrefixes(String[] words, String s) {
        int count = 0;
        for (String w : words) {
            if (s.startsWith(w)) {
                count++;
            }
        }
        return count;
    }
}
