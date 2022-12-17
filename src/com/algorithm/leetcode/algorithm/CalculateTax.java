package com.algorithm.leetcode.algorithm;

public class CalculateTax {

    public static void main(String[] args) {
        int[][] brackets = {{3, 50}, {7, 10}, {12, 25}};
        int income = 10;
//        int[][] brackets = {{1, 0}, {4, 25}, {5, 50}};
//        int income = 2;
//        int[][] brackets = {{2, 50}};
//        int income = 0;
        double result = calculateTax(brackets, income);
        System.out.println(result);
    }

    public static double calculateTax(int[][] brackets, int income) {
        double result = 0.0;
        int prev = 0;
        for (int[] bracket : brackets) {
            if (income < prev) {
                break;
            }
            result += ((double) (Math.min(income, bracket[0]) - prev) * bracket[1] / 100);
            prev = bracket[0];
        }
        return result;
    }
}
