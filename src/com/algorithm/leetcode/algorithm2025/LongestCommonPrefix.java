package com.algorithm.leetcode.algorithm2025;

import java.util.Arrays;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
//        String[] strs = {"dog","racecar","car"};
//        String[] strs = {"reflower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {

        if (strs == null || strs.length == 0) {
            return "";
        }

        Arrays.sort(strs);

        String first = strs[0];
        String last = strs[strs.length - 1];
        int i = 0;
        while (i < first.length() && i < last.length() && first.charAt(i) == last.charAt(i)) {
            i++;
        }

        return first.substring(0, i);

//        int count;
//        String currentPrefix = "";
//        for (int i = strs[0].length(); i >= 0; i--) {
//            currentPrefix = strs[0].substring(0, i);
//            count = 0;
//            for (int j = 1; j <= strs.length - 1; j++) {
//                if (strs[j].startsWith(currentPrefix)) {
//                    count++;
//                }
//            }
//            if (count == strs.length - 1) {
//                break;
//            }
//        }
//
//        return currentPrefix;
    }
}
