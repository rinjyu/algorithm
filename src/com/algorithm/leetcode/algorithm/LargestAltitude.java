package com.algorithm.leetcode.algorithm;

public class LargestAltitude {

    public static void main(String[] args) {
        int[] gain = {-5,1,5,0,-7};
//        int[] gain = {-4, -3, -2, -1, 4, 3, 2};
        int result = largestAltitude(gain);
        System.out.println(result);
    }

    public static int largestAltitude(int[] gain) {
        int max = 0;
        int current = 0;
        for (int n : gain) {
            current += n;
            max = Math.max(max, current);
        }
        return max;
    }
}
