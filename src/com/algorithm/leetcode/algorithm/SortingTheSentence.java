package com.algorithm.leetcode.algorithm;

public class SortingTheSentence {

    public static void main(String[] args) {
        String s = "is2 sentence4 This1 a3";
//        String s = "Myself2 Me1 I4 and3";
        String result = sortSentence(s);
        System.out.println(result);
    }

    public static String sortSentence(String s) {
        String[] strings = s.split(" ");
        StringBuilder result = new StringBuilder();
        int i = 1;
        while (i <= strings.length) {
            for (String word : strings) {
                String findWord = String.valueOf(i);
                if (word.contains(findWord)) {
                    result.append(word, 0, word.lastIndexOf(findWord));
                    i++;
                    if (i <= strings.length) {
                        result.append(" ");
                    }
                    break;
                }
            }
        }
        return result.toString();
    }
}
