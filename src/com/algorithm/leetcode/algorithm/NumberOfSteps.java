package com.algorithm.leetcode.algorithm;

public class NumberOfSteps {

    public static void main(String[] args) {
        int num = 14;
//        int num = 8;
        int result = numberOfSteps(num);
        System.out.println(result);
    }

    public static int numberOfSteps(int num) {
        int result = 0;
        while (num != 0) {
            result++;
            num = ((num % 2) == 0) ? (num / 2) : (num - 1);
        }
        return result;
    }
}
