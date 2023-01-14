package com.algorithm.leetcode.algorithm;

public class BinaryGap {

    public static void main(String[] args) {
        int n = 22;
//        int n = 8;
//        int n = 5;
        int result = binaryGap(n);
        System.out.println(result);
    }

    public static int binaryGap(int n) {
        String binary = Integer.toBinaryString(n);
        int max = -1;
        int i = 0;
        for (int j = 0; j < binary.length(); j++) {
            char c = binary.charAt(j);
            if (c == '1') {
                int current = j - i;
                if (max < current) {
                    max = current;
                }
                i = j;
            }
        }
        return max;
    }
}
