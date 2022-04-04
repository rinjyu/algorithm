package com.algorithm.leetcode.algorithm;

import java.util.Arrays;
import java.util.Objects;

public class PlusOne {

    public static void main(String[] args) {
        int[] digits = {1, 2, 3};
//        int[] digits = {4, 3, 2, 1};
//        int[] digits = {9};
        int[] result = plusOne(digits);
        System.out.println(Arrays.toString(result));
    }

    public static int[] plusOne(int[] digits) {
        if (!isValidArray(digits)) {
            return new int[0];
        }
        for (int i = digits.length - 1; i >= 0; i--) {
            int number = digits[i];
            number++;
            if (number == 10) {
                digits[i] = 0;
            } else {
                digits[i] = number;
                return digits;
            }
        }
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }

    private static boolean isValidArray(int[] digits) {
        return !Objects.isNull(digits) && digits.length >= 1 && digits.length <= 100;
    }
}