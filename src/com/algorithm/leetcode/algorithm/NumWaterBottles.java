package com.algorithm.leetcode.algorithm;

public class NumWaterBottles {

    public static void main(String[] args) {
        int numBottles = 9;
        int numExchange = 3;
//        int numBottles = 15;
//        int numExchange = 4;
        int result = numWaterBottles(numBottles, numExchange);
        System.out.println(result);
    }

    public static int numWaterBottles(int numBottles, int numExchange) {
        int sum = numBottles;
        while (numBottles >= numExchange) {
            int i = numBottles / numExchange;
            sum += i;
            numBottles = i + (numBottles % numExchange);
        }
        return sum;
    }
}
