package com.algorithm.leetcode.algorithm;

public class ReverseWords {

    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
//        String s = "God Ding";
        String result = reverseWords(s);
        System.out.println(result);
    }

    public static String reverseWords(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String t : s.split(" ")) {
            StringBuilder tempBuilder = new StringBuilder();
            tempBuilder.append(t);
            stringBuilder.append(tempBuilder.reverse());
            stringBuilder.append(" ");
        }
        return stringBuilder.substring(0, stringBuilder.toString().length() - 1);
    }
}
