package com.algorithm.leetcode.algorithm2025;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CloseStrings {

    public static void main(String[] args) {

        String word1 = "abc";
        String word2 = "bca";

//        String word1 = "a";
//        String word2 = "aa";

//        String word1 = "cabbba";
//        String word2 = "abbccc";

        System.out.println(closeStrings(word1, word2));
    }

    public static boolean closeStrings(String word1, String word2) {

        // 길이
        if (word1.length() != word2.length()) {
            return false;
        }

        // 문자의 집합
        Set<Character> set1 = new HashSet<>();
        for (Character c : word1.toCharArray()) {
            set1.add(c);
        }

        Set<Character> set2 = new HashSet<>();
        for (Character c : word2.toCharArray()) {
            set2.add(c);
        }

        if (!set1.equals(set2)) {
            return false;
        }

        // 문자 집합의 빈도
        int[] frequency1 = new int[26];
        for (Character c : word1.toCharArray()) {
            frequency1[c - 'a']++;
        }

        int[] frequency2 = new int[26];
        for (Character c : word2.toCharArray()) {
            frequency2[c - 'a']++;
        }

        Arrays.sort(frequency1);
        Arrays.sort(frequency2);

        return Arrays.equals(frequency1, frequency2);
    }
}
