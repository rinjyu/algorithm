package com.algorithm.leetcode.algorithm;

import java.util.ArrayList;
import java.util.List;

public class TextJustification {

    public static void main(String[] args) {
        String[] words = {"This", "is", "an", "example", "of", "text", "justification."};
        int maxWidth = 16;
//        String[] words = {"Science", "is", "what", "we", "understand", "well", "enough", "to",
//            "explain", "to", "a", "computer.", "Art", "is", "everything", "else", "we", "do"};
//        int maxWidth = 20;
        List<String> result = fullJustify(words, maxWidth);
        for (String s : result) {
            System.out.println(s);
        }
    }

    public static List<String> fullJustify(String[] words, int maxWidth) {
        List<String> resultList = new ArrayList<>();
        int i = 0;
        while (i < words.length) {
            StringBuilder resultString = new StringBuilder(words[i]);
            int j = i + 1;
            int currentWidth = words[i].length();
            while (j < words.length && currentWidth + 1 + words[j].length() <= maxWidth) {
                currentWidth += 1 + words[j].length();
                j++;
            }
            int currentWordsNumber = j - i - 1;
            if (currentWordsNumber == 0 || j == words.length) {
                for (int k = i + 1; k < j; k++) {
                    resultString.append(" ");
                    resultString.append(words[k]);
                }
                int remainLength = maxWidth - resultString.length();
                resultString.append(" ".repeat(Math.max(0, remainLength)));
            } else {
                int numberSpace = (maxWidth - currentWidth) / currentWordsNumber;
                int extraSpace = (maxWidth - currentWidth) % currentWordsNumber;
                for (int k = i + 1; k < j; k++) {
                    resultString.append(" ".repeat(Math.max(0, numberSpace)));
                    if (extraSpace > 0) {
                        resultString.append(" ");
                        extraSpace--;
                    }
                    resultString.append(" ");
                    resultString.append(words[k]);
                }
            }
            resultList.add(resultString.toString());
            i = j;
        }
        return resultList;
    }
}