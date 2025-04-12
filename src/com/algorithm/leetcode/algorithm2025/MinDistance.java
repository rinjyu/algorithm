package com.algorithm.leetcode.algorithm2025;

public class MinDistance {

    public static void main(String[] args) {

        String word1 = "horse";
        String word2 = "ros";

//        String word1 = "intention";
//        String word2 = "execution";
        System.out.println(minDistance(word1, word2));
    }

    public static int minDistance(String word1, String word2) {

        if (word1.length() < word2.length()) {
            return minDistance(word2, word1);
        }

        int length1 = word1.length();
        int length2 = word2.length();

        int[] previous = new int[length2 + 1];
        int[] current = new int[length2 + 1];

        for (int i = 0; i <= length2; i++) {
            previous[i] = i;
        }

        for (int i = 1; i <= length1; i++) {
            current[0] = i;
            for (int j = 1; j <= length2; j++) {
                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    current[j] = previous[j - 1];
                } else {
                    current[j] = 1 + Math.min(previous[j], Math.min(current[j - 1], previous[j - 1]));
                }
            }

            int[] temp = previous;
            previous = current;
            current = temp;
        }

        return previous[length2];
    }



}
