package com.algorithm.leetcode.algorithm;

import java.util.HashSet;
import java.util.Set;

public class NumDifferentIntegers {

    public static void main(String[] args) {
        String word = "a123bc34d8ef34";
//        String word = "leet1234code234";
//        String word = "a1b01c001";
        int result = numDifferentIntegers(word);
        System.out.println(result);
    }

    public static int numDifferentIntegers(String word) {
        String[] array = word.replaceAll("[a-zA-Z]", " ").split("\\s+");
        Set<String> set = new HashSet<>();
        for (String s : array) {
            if (!s.isEmpty())
                set.add(s.replaceAll("^0*", ""));
        }
        return set.size();
    }
}
