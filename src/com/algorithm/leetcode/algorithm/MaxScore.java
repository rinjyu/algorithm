package com.algorithm.leetcode.algorithm;

public class MaxScore {

    public static void main(String[] args) {
        String s = "011101";
//        String s = "00111";
//        String s = "1111";
        int result = maxScore(s);
        System.out.println(result);
    }

    public static int maxScore(String s) {
        int zeroCount = 0;
        int oneCount = 0;
        int maxScore = Integer.MIN_VALUE;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                zeroCount++;
            } else {
                oneCount++;
            }
            if (i != s.length() - 1) {
                maxScore = Math.max(zeroCount - oneCount, maxScore);
            }
        }
        return maxScore + oneCount;
    }
}
