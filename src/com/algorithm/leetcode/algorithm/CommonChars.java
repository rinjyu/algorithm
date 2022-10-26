package com.algorithm.leetcode.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommonChars {

    public static void main(String[] args) {
        String[] words = {"bella", "label", "roller"};
//        String[] words = {"cool", "lock", "cook"};
        List<String> result = commonChars(words);
        System.out.println(Arrays.toString(result.toArray()));
    }

    public static List<String> commonChars(String[] words) {
        List<String> result = new ArrayList<>();
        for (char c = 'a'; c <= 'z'; c++) {
            int min = Integer.MAX_VALUE;
            for (String w : words) {
                int count = 0;
                for (char s: w.toCharArray()) {
                    if (s == c) {
                        count++;
                    }
                }
                min = Math.min(min, count);
            }
            for (int i = 0; i < min; i++) {
                result.add(String.valueOf(c));
            }
        }

        return result;
    }
}
