package com.algorithm.leetcode.algorithm;

import java.util.ArrayList;
import java.util.List;

public class ShortestCompletingWord {

    public static void main(String[] args) {
        String licensePlate = "1s3 PSt";
        String[] words = {"step", "steps", "stripe", "stepple"};
//        String licensePlate = "1s3 456";
//        String[] words = {"looks", "pest", "stew", "show"};
        String result = shortestCompletingWord(licensePlate, words);
        System.out.println(result);
    }

    public static String shortestCompletingWord(String licensePlate, String[] words) {
        int result[] = new int[26];
        licensePlate = licensePlate.toLowerCase();
        for (int i = 0; i < licensePlate.length(); i++) {
            if (Character.isAlphabetic(licensePlate.charAt(i))) {
                result[licensePlate.charAt(i) - 97]++;
            }
        }

        int count[][] = new int[words.length][26];
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++)
                count[i][words[i].charAt(j) - 97]++;
        }

        List<String> list = new ArrayList();
        int max = Integer.MAX_VALUE;

        for (int i = 0; i < words.length; i++) {
            int c = 0;
            for (int j = 0; j < 26; j++) {
                if (count[i][j] >= result[j]) {
                    c++;
                }
            }
            if (c == 26) {
                int length = words[i].length();
                if (length < max) {
                    max = length;
                    list.add(words[i]);
                }
            }
        }

        return list.get(list.size() - 1);
    }
}
