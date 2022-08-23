package com.algorithm.leetcode.algorithm;

public class PrefixCount {

    public static void main(String[] args) {
        String[] words = {"pay","attention","practice","attend"};
        String pref = "at";
//        String[] words = {"leetcode","win","loops","success"};
//        String pref = "code";
        int result = prefixCount(words, pref);
        System.out.println(result);
    }

    public static int prefixCount(String[] words, String pref) {
        int count = 0;
        int prefixLength = pref.length();
        for (String s : words) {
            if (s.length() < prefixLength) {
                continue;
            }
            if (s.substring(0, prefixLength).equals(pref)) {
                count++;
            }
        }
        return count;
    }
}
