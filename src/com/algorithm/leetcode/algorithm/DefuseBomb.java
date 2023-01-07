package com.algorithm.leetcode.algorithm;

import java.util.Arrays;

public class DefuseBomb {

    public static void main(String[] args) {
        int[] code = {5, 7, 1, 4};
        int k = 3;
//        int[] code = {1, 2, 3, 4};
//        int k = 0;
//        int[] code = {2, 4, 9, 3};
//        int k = -2;
        int[] result = decrypt(code, k);
        System.out.println(Arrays.toString(result));
    }

    public static int[] decrypt(int[] code, int k) {
        int[] result = new int[code.length];
        if (k == 0) {
            return result;
        }
        for (int i = 0; i < result.length; i++) {
            if (k > 0) {
                for (int j = i + 1; j < i + k + 1; j++) {
                    result[i] += code[j % code.length];
                }
            } else {
                for (int j = i - 1; j > i + k - 1; j--) {
                    result[i] += code[(j + code.length) % code.length];
                }
            }
        }
        return result;
    }
}
