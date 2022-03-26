package com.algorithm.leetcode.algorithm;

import java.util.Objects;

public class LengthOfLastWord {

    public static void main(String[] args) {
//        String s = "Hello World";
//        String s = "   fly me   to   the moon  ";
        String s = "luffy is still joyboy";
        int result = lengthOfLastWord(s);
        System.out.println(result);
    }

    public static int lengthOfLastWord(String s) {
        if (!isValidString(s)) {
            return 0;
        }
        String[] strings = s.split(" ");
        return strings[strings.length - 1].length();
    }

    private static boolean isValidString(String s) {
        return !Objects.isNull(s) && s.length() >= 1 && s.length() <= 10_000;
    }
}