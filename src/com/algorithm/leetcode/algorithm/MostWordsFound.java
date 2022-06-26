package com.algorithm.leetcode.algorithm;

public class MostWordsFound {

    public static void main(String[] args) {
        String[] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
//        String[] sentences = {"please wait", "continue to fight", "continue to win"};
        int result = mostWordsFound(sentences);
        System.out.println(result);
    }

    public static int mostWordsFound(String[] sentences) {
        int max = 0;
        for (String s : sentences) {
            max = Math.max(max, s.split(" ").length);
        }
        return max;
    }
}
