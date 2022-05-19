package com.algorithm.leetcode.algorithm;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class WordBreak {

    public static void main(String[] args) {
        String s = "leetcode";
        List<String> wordDict = Arrays.asList("leet","code");
//        String s = "applepenapple";
//        List<String> wordDict = Arrays.asList("apple","pen");
//        String s = "catsandog";
//        List<String> wordDict = Arrays.asList("cats","dog","sand","and","cat");
//        String s = "bb";
//        List<String> wordDict = Arrays.asList("a", "b", "bbb", "bbbb");
        boolean result = wordBreak(s, wordDict);
        System.out.println(result);
    }

    public static boolean wordBreak(String s, List<String> wordDict) {
        int length = s.length();
        boolean[] result = new boolean[length + 1];
        HashSet<String> set = new HashSet<>(wordDict);
        result[0] = true;
        for (int i = 1; i <= length; i++) {
            for (int j = 1; j <= i; j++) {
                if (set.contains(s.substring(i - j, i)) && result[i - j]) {
                    result[i] = true;
                    break;
                }
            }
        }
        return result[length];
    }
}
