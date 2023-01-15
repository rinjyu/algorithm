package com.algorithm.leetcode.algorithm;

public class LargestInteger {

    public static void main(String[] args) {
        int num = 1234;
//        int num = 65875;
        int result = largestInteger(num);
        System.out.println(result);
    }

    public static int largestInteger(int num) {
        char[] c = String.valueOf(num).toCharArray();
        for (int i = 0; i < c.length; i++) {
            for (int j = i + 1; j < c.length; j++) {
                if (c[j] > c[i] && (c[j] - c[i]) % 2 == 0) {
                    swap(c, i, j);
                }
            }
        }
        return Integer.parseInt(new String(c));
    }

    private static void swap(char[] c, int i, int j) {
        char temp = c[i];
        c[i] = c[j];
        c[j] = temp;
    }
}
