package com.algorithm.leetcode.algorithm;

public class AddTwoIntegers {

    public static void main(String[] args) {
        int num1 = 12;
        int num2 = 5;
//        int num1 = -10;
//        int num2 = 4;
        int result = sum(num1, num2);
        System.out.println(result);
    }

    public static int sum(int num1, int num2) {
        return num1 + num2;
    }
}
