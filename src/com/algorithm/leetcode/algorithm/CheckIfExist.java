package com.algorithm.leetcode.algorithm;

public class CheckIfExist {

    public static void main(String[] args) {
        int[] arr = {10, 2, 5, 3};
//        int[] arr = {3, 1, 7, 11};
        boolean result = checkIfExist(arr);
        System.out.println(result);
    }

    public static boolean checkIfExist(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == 2 * arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}
