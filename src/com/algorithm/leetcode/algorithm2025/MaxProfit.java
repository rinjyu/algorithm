package com.algorithm.leetcode.algorithm2025;

public class MaxProfit {

    public static void main(String[] args) {

//        int[] prices = {1, 3, 2, 8, 4, 9};
//        int free = 2;

        int[] prices = {1, 3, 7, 5, 10, 3};
        int free = 3;

        System.out.println(maxProfit(prices, free));
    }

    public static int maxProfit(int[] prices, int fee) {

        if (prices.length == 0) {
            return 0;
        }

        int cash = 0;
        int hold = -prices[0];
        for (int i = 0; i < prices.length; i++) {
            cash = Math.max(cash, hold + prices[i] - fee);
            hold = Math.max(hold, cash - prices[i]);
        }

        return cash;
    }
}
