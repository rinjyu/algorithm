package com.algorithm.leetcode.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LetterCasePermutation {

    public static void main(String[] args) {
        String s = "a1b2";
//        String s = "3z4";
        List<String> result = letterCasePermutation(s);
        System.out.println(Arrays.toString(result.toArray()));
    }

    public static List<String> letterCasePermutation(String s) {
        List<String> result = new ArrayList<>();
        char[] c = s.toCharArray();
        tracking(result, c, 0);
        return result;
    }

    private static void tracking(List<String> result, char[] c, int i) {
        if (i == c.length) {
            result.add(new String(c));
        } else {
            if (Character.isLetter(c[i])) {
                c[i] = Character.toUpperCase(c[i]);
                tracking(result, c, i + 1);
                c[i] = Character.toLowerCase(c[i]);
            }
            tracking(result, c, i + 1);
        }
    }
}
