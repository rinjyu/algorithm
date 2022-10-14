package com.algorithm.leetcode.algorithm;

public class CheckDistances {

    public static void main(String[] args) {
        String s = "abaccb";
        int[] distance = {1, 3, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
//        String s = "aa";
//        int[] distance = {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        boolean result = checkDistances(s, distance);
        System.out.println(result);
    }

    public static boolean checkDistances(String s, int[] distance) {
        for (char c : s.toCharArray()) {
            int first = s.indexOf(c);
            int last = s.lastIndexOf(c);
            if (distance[c - 'a'] != (last - first - 1)) {
                return false;
            }
        }
        return true;
    }
}
