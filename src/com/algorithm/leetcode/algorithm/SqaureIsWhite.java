package com.algorithm.leetcode.algorithm;

public class SqaureIsWhite {

    public static void main(String[] args) {
        String coordinates = "a1";
//        String coordinates = "h3";
//        String coordinates = "c7";
        boolean result = squareIsWhite(coordinates);
        System.out.println(result);
    }

    public static boolean squareIsWhite(String coordinates) {
        int x = coordinates.charAt(0) - 'a' + 1;
        int y = coordinates.charAt(1);
        return (x + y) % 2 != 0;
    }
}
