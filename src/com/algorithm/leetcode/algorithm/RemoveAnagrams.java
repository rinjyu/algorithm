package com.algorithm.leetcode.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveAnagrams {

    public static void main(String[] args) {
        String[] words = {"abba", "baba", "bbaa", "cd", "cd"};
//        String[] words = {"a", "b", "c", "d", "e"};
        List<String> result = removeAnagrams(words);
        System.out.println(Arrays.toString(result.toArray()));
    }

    public static List<String> removeAnagrams(String[] words) {
        List<String> result = new ArrayList<>();
        String temp = "";
        for (String s : words) {
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String current = new String(c);
            if (!current.equals(temp))
                result.add(s);
            temp = current;
        }
        return result;
    }
}
