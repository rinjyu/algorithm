package com.algorithm.leetcode.algorithm;

public class EditDistance {

    public static void main(String[] args) {
        String word1 = "horse";
        String word2 = "ros";
//        String word1 = "intention";
//        String word2 = "execution";
        int result = minDistance(word1, word2);
        System.out.println(result);
    }

    public static int minDistance(String word1, String word2) {
        int originLength = word1.length();
        int resultLength = word2.length();
        int[] result = new int[resultLength + 1];
        for (int i = 1; i <= resultLength; i++) {
            result[i] = i;
        }
        for (int i = 1; i <= originLength; i++) {
            int[] temp = new int[resultLength + 1];
            temp[0] = i;
            for (int j = 1; j <= resultLength; j++) {
                if (word1.charAt(i - 1) != word2.charAt(j - 1)) {
                    temp[j] = 1 + Math.min(Math.min(temp[j - 1], result[j]), result[j - 1]);
                } else {
                    temp[j] = result[j - 1];
                }
            }
            result = temp;
        }
        return result[resultLength];
    }
}