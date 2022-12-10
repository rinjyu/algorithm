package com.algorithm.leetcode.algorithm;

import java.util.ArrayList;
import java.util.List;

public class FindOcurrences {

    public static void main(String[] args) {
        String text = "alice is a good girl she is a good student";
        String first = "a";
        String second = "good";
//        String text = "we will we will rock you";
//        String first = "we";
//        String second = "will";
        String[] result = findOcurrences(text, first, second);
    }

    public static String[] findOcurrences(String text, String first, String second) {
        String[] s = text.split(" ");
        List<String> list = new ArrayList<>();
        for (int i = 2; i < s.length; i++) {
            if (s[i - 1].equals(second) && s[i - 2].equals(first)) {
                list.add(s[i]);
            }
        }
        String[] result = new String[list.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}
