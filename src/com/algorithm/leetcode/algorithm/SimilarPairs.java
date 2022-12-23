package com.algorithm.leetcode.algorithm;

import java.util.*;

public class SimilarPairs {

    public static void main(String[] args) {
        String[] words = {"aba", "aabb", "abcd", "bac", "aabc"};
//        String[] words = {"aabb", "ab", "ba"};
//        String[] words = {"nba", "cba", "dba"};
        int result = similarPairs(words);
        System.out.println(result);
    }

    public static int similarPairs(String[] words) {
        int result = 0;
        for (int i = 0; i < words.length; i++) {
            Set<Character> checkedSet = new HashSet<>();
            for (char c : words[i].toCharArray()) {
                checkedSet.add(c);
            }
            for (int j = i + 1; j < words.length; j++) {
                Set<Character> currentSet = new HashSet<>();
                for (char c : words[j].toCharArray()) {
                    currentSet.add(c);
                }
                if (Objects.equals(checkedSet, currentSet)) {
                    result++;
                }
            }
        }
        return result;
    }
}
