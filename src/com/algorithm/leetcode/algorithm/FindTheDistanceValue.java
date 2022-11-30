package com.algorithm.leetcode.algorithm;

public class FindTheDistanceValue {

    public static void main(String[] args) {
        int[] arr1 = {4, 5, 8};
        int[] arr2 = {10, 9, 1, 8};
        int d = 2;
//        int[] arr1 = {1, 4, 2, 3};
//        int[] arr2 = {-4, -3, 6, 10, 20, 30};
//        int d = 3;
//        int[] arr1 = {2, 1, 100, 3};
//        int[] arr2 = {-5, -2, 10, -3, 7};
//        int d = 6;
        int result = findTheDistanceValue(arr1, arr2, d);
        System.out.println(result);
    }

    public static int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int count = 0;
        for (int n1 : arr1) {
            boolean isIncrease = true;
            for (int n2 : arr2) {
                if (Math.abs(n1 - n2) <= d) {
                    isIncrease = false;
                    break;
                }
            }
            if (isIncrease) {
                count++;
            }
        }
        return count;
    }
}
