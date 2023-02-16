package com.algorithm.leetcode.algorithm;

public class MaxProduct2 {

    public static void main(String[] args) {
        String[] words = {"abcw", "baz", "foo", "bar", "xtfn", "abcdef"};
//        String[] words = {"a", "ab", "abc", "d", "cd", "bcd", "abcd"};
//        String[] words = {"a", "aa", "aaa", "aaaa"};
        int result = maxProduct(words);
        System.out.println(result);
    }

    public static int maxProduct(String[] words) {
        int max = 0;
        int[][] mapping = new int[words.length][26];

        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                if (mapping[i][words[i].charAt(j) - 'a'] == 0) {
                    mapping[i][words[i].charAt(j) - 'a']++;
                }
            }
        }
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (lettersNotCommon(i, j, mapping)) {
                    max = Math.max(max, words[i].length() * words[j].length());
                }
            }
        }
        return max;
    }

    private static boolean lettersNotCommon(int a, int b, int[][] map) {
        for (int j = 0; j < 26; j++) {
            if (map[a][j] == 1 && map[b][j] == 1) {
                return false;
            }
        }
        return true;
    }
}
