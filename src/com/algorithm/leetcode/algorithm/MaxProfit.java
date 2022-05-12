package com.algorithm.leetcode.algorithm;

public class MaxProfit {

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int result = maxProfit(prices);
        System.out.println(result);
    }

    public static int maxProfit(int[] prices) {
        int max = 0;
        int price = prices[0];
        for (int i = 1; i < prices.length; i++) {
            price = Math.min(price, prices[i]);
            max = Math.max(prices[i] - price, max);
        }
        return max;
    }
}
