package com.algorithm.leetcode.algorithm;

public class MinTimeToType {

    public static void main(String[] args) {
        String word = "abc";
//        String word = "bza";
//        String word = "zjpc";
        int result = minTimeToType(word);
        System.out.println(result);
    }

    public static int minTimeToType(String word) {
        int count = word.length();
        char previous = 'a';
        for (char c : word.toCharArray()) {
            char current = c;
            int difference = Math.abs(current - previous);
            count += Math.min(difference, 26 - difference);
            previous = current;
        }
        return count;
    }
}
