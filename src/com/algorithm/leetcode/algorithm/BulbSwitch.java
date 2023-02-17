package com.algorithm.leetcode.algorithm;

public class BulbSwitch {

    public static void main(String[] args) {
        int n = 3;
//        int n = 0;
//        int n = 1;
        int result = bulbSwitch(n);
        System.out.println(result);
    }

    public static int bulbSwitch(int n) {
        return (int) Math.sqrt(n);
    }
}
