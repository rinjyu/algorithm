package com.algorithm.leetcode.algorithm;

public class CanFormArray {

    public static void main(String[] args) {
        int[] arr = {15, 88};
        int[][] pieces = {{88}, {15}};
//        int[] arr = {49, 18, 16};
//        int[][] pieces = {{16, 18, 49}};
//        int[] arr = {91, 4, 64, 78};
//        int[][] pieces = {{78}, {4, 64}, {91}};
        boolean result = canFormArray(arr, pieces);
        System.out.println(result);
    }

    public static boolean canFormArray(int[] arr, int[][] pieces) {
        StringBuilder result = new StringBuilder();
        for (int x : arr) {
            result.append("#");
            result.append(x);
            result.append("#");
        }
        for (int i = 0; i < pieces.length; i++) {
            StringBuilder temp = new StringBuilder();
            for (int j = 0; j < pieces[i].length; j++) {
                temp.append("#");
                temp.append(pieces[i][j]);
                temp.append("#");
            }
            if (!result.toString().contains(temp.toString())) {
                return false;
            }
        }
        return true;
    }
}
