package com.algorithm.leetcode.algorithm;

public class MinimumRecolors {

    public static void main(String[] args) {
        String blocks = "WBBWWBBWBW";
        int k = 7;
//        String blocks = "WBWBBBW";
//        int k = 2;
        int result = minimumRecolors(blocks, k);
        System.out.println(result);
    }

    public static int minimumRecolors(String blocks, int k) {
        int min = k;
        int count = 0;
        for (int i = 0; i < blocks.length(); i++) {
            if (blocks.charAt(i) == 'W') {
                count++;
            }
            if (i >= k - 1) {
                if (i - k >= 0 && blocks.charAt(i - k) == 'W') {
                    count--;
                }
                min = Math.min(min, count);
            }
        }
        return min;
    }
}
