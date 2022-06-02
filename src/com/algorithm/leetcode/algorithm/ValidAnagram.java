package com.algorithm.leetcode.algorithm;

import java.util.Arrays;

public class ValidAnagram {

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
//        String s = "rat";
//        String t = "car";
        boolean result = isAnagram(s, t);
        System.out.println(result);
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] array1 = s.toCharArray();
        char[] array2 = t.toCharArray();
        Arrays.sort(array1);
        Arrays.sort(array2);
        return Arrays.equals(array1, array2);
    }
}
