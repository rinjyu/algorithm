package com.algorithm.leetcode.algorithm;

public class LemonadeChange {

    public static void main(String[] args) {
        int[] biils = {5, 5, 5, 10, 20};
//        int[] biils = {5, 5, 10, 10, 20};
        boolean result = lemonadeChange(biils);
        System.out.println(result);
    }

    public static boolean lemonadeChange(int[] bills) {
        int five = 0;
        int ten = 0;
        for (int i : bills) {
            if (i == 5) {
                five++;
            } else if (i == 10) {
                five--;
                ten++;
            } else if (ten > 0) {
                ten--;
                five--;
            } else {
                five -= 3;
            }
            if (five < 0) {
                return false;
            }
        }
        return true;
    }
}
