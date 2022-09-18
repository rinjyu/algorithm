package com.algorithm.leetcode.algorithm;

import java.util.Arrays;
import java.util.Stack;

public class FinalPrices {

    public static void main(String[] args) {
        int[] prices = {8, 4, 6, 2, 3};
        int[] result = finalPrices(prices);
        System.out.println(Arrays.toString(result));
    }

    public static int[] finalPrices(int[] prices) {
        int i = 0;
        Stack<Integer> stack = new Stack<>();
        for (int price : prices) {
            while (!stack.isEmpty() && prices[stack.peek()] >= price) {
                prices[stack.pop()] -= price;
            }
            stack.push(i);
            i++;
        }
        return prices;
    }
}
