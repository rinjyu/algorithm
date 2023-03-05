package com.algorithm.leetcode.algorithm;

public class RotateString {

    public static void main(String[] args) {
        String s = "abcde";
        String goal = "cdeab";
//        String s = "abcde";
//        String goal = "abced";
        boolean result = rotateString(s, goal);
        System.out.println(result);
    }

    public static boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        if (s.equals(goal)) {
            return true;
        }

        StringBuilder result = new StringBuilder();
        for (int i = 1; i < s.length(); i++) {
            result.append(s.substring(1)).append(s.charAt(0));
            s = result.toString();
            if (s.equals(goal)) {
                return true;
            }
            result.setLength(0);
        }
        return false;
    }
}
