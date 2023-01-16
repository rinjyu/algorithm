package com.algorithm.leetcode.algorithm;

public class FindLUSlength {

    public static void main(String[] args) {
        String a = "aba";
        String b = "cdc";
//        String a = "aaa";
//        String b = "bbb";
//        String a = "aaa";
//        String b = "aaa";
        int result = findLUSlength(a, b);
        System.out.println(result);
    }

    public static int findLUSlength(String a, String b) {
        if (a.equals(b)) {
            return -1;
        }
        return Math.max(a.length(), b.length());
    }
}
