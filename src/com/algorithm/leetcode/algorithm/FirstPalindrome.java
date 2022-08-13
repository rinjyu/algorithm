package com.algorithm.leetcode.algorithm;

public class FirstPalindrome {

    public static void main(String[] args) {
        String[] words = {"abc", "car", "ada", "racecar", "cool"};
//        String[] words = {"notapalindrome", "racecar"};
//        String[] words = {"def", "ghi"};
        String result = firstPalindrome(words);
        System.out.println(result);
    }

    public static String firstPalindrome(String[] words) {
        for (String s : words) {
            if (s.equals(new StringBuilder(s).reverse().toString())) {
                return s;
            }
        }
        return "";
    }
}
