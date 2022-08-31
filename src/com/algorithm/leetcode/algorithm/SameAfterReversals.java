package com.algorithm.leetcode.algorithm;

public class SameAfterReversals {

    public static void main(String[] args) {
        int num = 526;
//        int num = 1800;
//        int num = 0;
        boolean result = isSameAfterReversals(num);
        System.out.println(result);
    }

    public static boolean isSameAfterReversals(int num) {
        int num1 = reverse(num);
        int num2 = reverse(num1);
        return num == num2 ? true : false;
    }

    private static int reverse(int num) {
        int result = 0;
        int temp;
        while (num != 0) {
            temp = num % 10;
            num /= 10;
            result = (result * 10) + temp;
        }
        return result;
    }
}
