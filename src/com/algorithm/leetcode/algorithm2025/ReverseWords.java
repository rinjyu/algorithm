package com.algorithm.leetcode.algorithm2025;

import java.util.Arrays;
import java.util.Collections;

public class ReverseWords {

    public static void main(String[] args) {
        String s = "the sky is blue";
//        String s = "  hello world  ";
//        String s = "a good   example";
        System.out.println(reverseWords(s));
    }

    private static String reverseWords(String s) {

        s = s.trim().replaceAll("\\s+", " ");
        String[] text = s.split(" ");
        Collections.reverse(Arrays.asList(text));

        return String.join(" ", text);

//        s = s.trim().replaceAll("\\s+", " ");
//        String[] text = s.split(" ");
//        String[] result = new String[s.split(" ").length];
//        for (int i = 0; i < text.length; i++) {
//            result[text.length - 1 - i] = text[i];
//        }
//
//        return String.join(" ", result);
    }
}
