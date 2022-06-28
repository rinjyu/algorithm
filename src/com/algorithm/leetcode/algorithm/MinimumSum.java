package com.algorithm.leetcode.algorithm;

import java.util.Arrays;

public class MinimumSum {

    public static void main(String[] args) {
        int num = 2932;
//        int num = 4009;
        int result = minimumSum(num);
        System.out.println(result);
    }

    public static int minimumSum(int num) {
        int[] array = new int[4];
        for (int i = 0; i < 4; i++) {
            array[i] = num % 10;
            num /= 10;
        }
        Arrays.sort(array);
        int num1 = (array[0] * 10) + array[2];
        int num2 = (array[1] * 10) + array[3];
        return num1 + num2;
    }
}
