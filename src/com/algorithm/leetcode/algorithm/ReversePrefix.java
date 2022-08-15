package com.algorithm.leetcode.algorithm;

public class ReversePrefix {

    public static void main(String[] args) {
        String word = "abcdefd";
        char ch = 'd';
//        String word = "xyxzxe";
//        char ch = 'z';
//        String word = "abcd";
//        char ch = 'z';
        String result = reversePrefix(word, ch);
        System.out.println(result);
    }

    public static String reversePrefix(String word, char ch) {
        int index = word.indexOf(ch);
        if (index < 0) {
            return word;
        } else {
            return reverse(index, index + 1, word);
        }
    }

    private static String reverse(int i, int j, String word) {
        StringBuilder stringBuilder = new StringBuilder();
        while (i >= 0) {
            stringBuilder.append(word.charAt(i--));
        }
        while (j < word.length()) {
            stringBuilder.append(word.charAt(j++));
        }
        return stringBuilder.toString();
    }
}
