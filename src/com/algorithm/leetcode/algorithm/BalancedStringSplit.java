package com.algorithm.leetcode.algorithm;

public class BalancedStringSplit {

    public static void main(String[] args) {
        String s = "RLRRLLRLRL";
//        String s = "RLLLLRRRLR";
//        String s = "LLLLRRRR";
        int result = balancedStringSplit(s);
        System.out.println(result);
    }

    public static int balancedStringSplit(String s) {
        int result = 0;
        int sum = 0;
        for (char c : s.toCharArray()) {
            sum += (c == 'R' ? 1 : -1);
            if (sum == 0) {
                result++;
            }
        }
        return result;
    }
}
