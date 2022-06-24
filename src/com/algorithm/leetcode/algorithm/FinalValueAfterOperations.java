package com.algorithm.leetcode.algorithm;

public class FinalValueAfterOperations {

    public static void main(String[] args) {
        String[] operations = {"--X", "X++", "X++"};
//        String[] operations = {"++X", "++X", "X++"};
        int result = finalValueAfterOperations(operations);
        System.out.println(result);
    }

    public static int finalValueAfterOperations(String[] operations) {
        int number = 0;
        for (String operation : operations) {
            if (operation.contains("--")) {
                number -= 1;
            } else {
                number += 1;
            }
        }
        return number;
    }
}
