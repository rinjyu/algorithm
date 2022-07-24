package com.algorithm.leetcode.algorithm;

public class TruncateSentence {

    public static void main(String[] args) {
        String s = "Hello how are you Contestant";
        int k = 4;
//        String s = "What is the solution to this problem";
//        int k = 4;
//        String s = "chopper is not a tanuki";
//        int k = 5;
        String result = truncateSentence(s, k);
        System.out.println(result);
    }

    public static String truncateSentence(String s, int k) {
        String[] strings = s.split(" ");
        StringBuilder result = new StringBuilder();
        int i = 1;
        while (i <= k) {
            result.append(strings[i - 1]);
            i++;
            if (i <= k) {
                result.append(" ");
            }
        }
        return result.toString();
    }
}
