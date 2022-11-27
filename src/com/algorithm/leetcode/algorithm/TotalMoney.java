package com.algorithm.leetcode.algorithm;

public class TotalMoney {

    public static void main(String[] args) {
        int n = 4;
//        int n = 10;
//        int n = 20;
        int result = totalMoney(n);
        System.out.println(result);
    }

    public static int totalMoney(int n) {
        int monday = 1;
        int current = 1;
        int leetcodeBank = 0;

        for (int i = 1; i <= n; i++) {
            leetcodeBank += current;
            current++;
            if (i % 7 == 0) {
                monday++;
                current = monday;
            }
        }
        return leetcodeBank;
    }
}
