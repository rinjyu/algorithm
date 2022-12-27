package com.algorithm.leetcode.algorithm;

public class MinOperations2 {

    public static void main(String[] args) {
        String[] logs = {"d1/", "d2/", "../", "d21/", "./"};
//        String[] logs = {"d1/", "d2/", "./", "d3/", "../", "d31/"};
//        String[] logs = {"d1/", "../", "../", "../"};
        int result = minOperations(logs);
        System.out.println(result);
    }

    public static int minOperations(String[] logs) {
        int result = 0;
        for (String log : logs) {
            if (log.charAt(0) != '.') {
                result = result + 1;
            } else if (log.charAt(1) == '.') {
                result = Math.max(0, result - 1);
            }
        }
        return result;
    }
}
