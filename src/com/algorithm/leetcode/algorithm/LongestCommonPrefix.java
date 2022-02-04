package com.algorithm.leetcode.algorithm;

import java.util.Arrays;
import java.util.Objects;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
//        String[] strs = {"dog","racecar","car"};
//        String[] strs = {"a"};
//        String[] strs = {"c", "acc", "ccc"};
        String result = longestCommonPrefix(strs);
        System.out.println(result);
    }

    public static String longestCommonPrefix(String[] strs) {
        String prefix = "";
        if (!isValidArray(strs)) {
            return prefix;
        }
        Arrays.sort(strs);
        if (!isValidText(strs[0])) {
            return prefix;
        }
        String target = strs[0];
        for (int i = 0; i <= target.length(); i++) {
            String tempPrefix = target.substring(0, i);
            while (strs[strs.length - 1].startsWith(tempPrefix)) {
                if (prefix.length() <= tempPrefix.length()) {
                    prefix = tempPrefix;
                    break;
                }
            }
        }
        return prefix;
    }

    public static boolean isValidArray(String[] array) {
        return !Objects.isNull(array) && array.length >= 1 && array.length <= 200;
    }

    public static boolean isValidText(String text) {
        return !text.isBlank() && text.length() <= 200;
    }
}
