package com.algorithm.leetcode.algorithm;

public class AreNumbersAscending {

    public static void main(String[] args) {
        String s = "1 box has 3 blue 4 red 6 green and 12 yellow marbles";
//        String s = "hello world 5 x 5";
//        String s = "sunset is at 7 51 pm overnight lows will be in the low 50 and 60 s";
        boolean result = areNumbersAscending(s);
        System.out.println(result);
    }

    public static boolean areNumbersAscending(String s) {
        int prev = 0;
        for (String t : s.split(" ")) {
            if (Character.isDigit(t.charAt(0))) {
                int num = Integer.parseInt(t);
                if (num <= prev) {
                    return false;
                } else {
                    prev = num;
                }
            }
        }
        return true;
    }
}
