package com.algorithm.leetcode.algorithm;

import java.util.Arrays;

public class DiStringMatch {

    public static void main(String[] args) {
        String s = "IDID";
//        String s = "III";
//        String s = "DDI";
        int[] result = diStringMatch(s);
        System.out.println(Arrays.toString(result));
    }

    public static int[] diStringMatch(String s) {
        int length = s.length();
        int[] result = new int[length + 1];
        int i = 0;
        int min = 0;
        int max = length;
        for (char c : s.toCharArray()) {
            if (c == 'I') {
                result[i++] = min++;
            } else {
                result[i++] = max--;
            }
        }
        result[length] = min;
        return result;
    }
}
