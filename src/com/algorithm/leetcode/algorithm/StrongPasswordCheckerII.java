package com.algorithm.leetcode.algorithm;

import java.util.HashSet;
import java.util.Set;

public class StrongPasswordCheckerII {

    public static void main(String[] args) {
        String password = "IloveLe3tcode!";
//        String password = "Me+You--IsMyDream";
//        String password = "1aB!";
        boolean result = strongPasswordCheckerII(password);
        System.out.println(result);
    }

    public static boolean strongPasswordCheckerII(String password) {
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (i > 0 && c == password.charAt(i - 1)) {
                return false;
            }
            if (Character.isLowerCase(c)) {
                set.add('l');
            } else if (Character.isUpperCase(c)) {
                set.add('u');
            } else if (Character.isDigit(c)) {
                set.add('d');
            } else {
                set.add('s');
            }
        }
        return password.length() >= 8 && set.size() == 4;
    }
}
