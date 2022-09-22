package com.algorithm.leetcode.algorithm;

public class PercentageLetter {

    public static void main(String[] args) {
        String s = "foobar";
        char letter = 'o';
//        String s = "jjjj";
//        char letter = 'k';
        int result = percentageLetter(s, letter);
        System.out.println(result);
    }

    public static int percentageLetter(String s, char letter) {
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == letter) {
                count++;
            }
        }
        return (count * 100) / s.length();
    }
}
