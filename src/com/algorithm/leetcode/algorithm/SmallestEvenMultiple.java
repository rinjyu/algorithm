package com.algorithm.leetcode.algorithm;

public class SmallestEvenMultiple {

    public static void main(String[] args) {
        int n = 5;
//        int n = 6;
        int result = smallestEvenMultiple(n);
        System.out.println(result);
    }

    public static int smallestEvenMultiple(int n) {
        return (n % 2 == 0) ? n : n * 2;
    }
}
