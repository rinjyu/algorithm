package com.algorithm.leetcode.algorithm;

import java.util.Arrays;

public class GetNoZeroIntegers {

    public static void main(String[] args) {
        int n = 2;
//        int n = 11;
        int[] result = getNoZeroIntegers(n);
        System.out.println(Arrays.toString(result));
    }

    public static int[] getNoZeroIntegers(int n) {
        int num;
        for (int i = 0; i < n; i++) {
            num = n - i;
            if (!(String.valueOf(i)).contains("0")
                    && !(String.valueOf(num)).contains("0")) {
                return new int[]{i, num};
            }
        }
        return new int[]{};
    }
}
