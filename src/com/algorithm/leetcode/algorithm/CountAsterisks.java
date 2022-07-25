package com.algorithm.leetcode.algorithm;

public class CountAsterisks {

    public static void main(String[] args) {
        String s = "l|*e*et|c**o|*de|";
//        String s = "iamprogrammer";
//        String s = "yo|uar|e**|b|e***au|tifu|l";
        int result = countAsterisks(s);
        System.out.println(result);
    }

    public static int countAsterisks(String s) {
        boolean isPipe = false;
        int count = 0;
        for (char c : s.toCharArray()) {
            if (!isPipe && c == '*') {
                count++;
            }
            if (c == '|') {
                isPipe = !isPipe;
            }
        }
        return count;
    }
}
