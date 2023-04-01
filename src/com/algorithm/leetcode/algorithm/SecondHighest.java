package com.algorithm.leetcode.algorithm;

import java.util.HashSet;
import java.util.Set;

public class SecondHighest {

    public static void main(String[] args) {
        String s = "dfa12321afd";
//        String s = "abc1111";
        int result = secondHighest(s);
        System.out.println(result);
    }

    public static int secondHighest(String s) {
        Set<Integer> set = new HashSet();
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                set.add(Integer.parseInt(String.valueOf(c)));
            }
        }
        int maximum = 0;
        int n = Integer.MIN_VALUE;
        for (int i : set) {
            maximum = Math.max(i, maximum);
        }
        for (int i : set) {
            if (i < maximum) {
                n = Math.max(i, n);
            }
        }
        return (n < 0) ? -1 : n;
    }
}
