package com.algorithm.leetcode.algorithm2025;

public class RemoveStarts {

    public static void main(String[] args) {

//        String s = "leet**cod*e";
        String s = "erase*****";
        System.out.println(removeStars(s));
    }

    public static String removeStars(String s) {

        StringBuilder result = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c == '*') {
                result.setLength(result.length() - 1);
            } else {
                result.append(c);
            }
        }

        return result.toString();
    }
}
