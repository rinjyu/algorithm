package com.algorithm.leetcode.algorithm;

public class MaximumValue {

    public static void main(String[] args) {
        String[] strs = {"alic3", "bob", "3", "4", "00000"};
//        String[] strs = {"1", "01", "001", "0001"};
        int result = maximumValue(strs);
        System.out.println(result);
    }

    public static int maximumValue(String[] strs) {
        int max = 0;
        for (int i = 0; i < strs.length; i++) {
            boolean isLetter = false;
            for (int j = 0; j < strs[i].length(); j++) {
                if (strs[i].charAt(j) >= 'a' && strs[i].charAt(j) <= 'z') {
                    isLetter = true;
                }
            }
            if (isLetter) {
                max = Math.max(max, strs[i].length());
            } else {
                max = Math.max(max, Integer.parseInt(strs[i]));
            }
        }
        return max;
    }
}
