package com.algorithm.leetcode.algorithm;

import java.util.HashSet;
import java.util.Set;

public class PartitionString {

    public static void main(String[] args) {
        String s = "abacaba";
//        String s = "ssssss";
        int result = partitionString(s);
        System.out.println(result);
    }

    public static int partitionString(String s) {
        int result = 0;
        Set<Character> set = new HashSet<>();
        for (char c : s.toCharArray()) {
            if (set.contains(c)) {
                result++;
                set.clear();
            }
            set.add(c);
        }
        return set.size() == 0 ? result : result + 1;
    }
}