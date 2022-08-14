package com.algorithm.leetcode.algorithm;

import java.util.HashSet;
import java.util.Set;

public class RepeatedCharacter {

    public static void main(String[] args) {
        String s = "abccbaacz";
//        String s = "abcdd";
        char result = repeatedCharacter(s);
        System.out.println(result);
    }

    public static char repeatedCharacter(String s) {
        Set<Character> set = new HashSet<>();
        for (char c : s.toCharArray()) {
            if (set.contains(c)) {
                return c;
            } else {
                set.add(c);
            }
        }
        throw new RuntimeException("String s는 적어도 하나의 반복 문자를 포함해야 합니다.");
    }
}
