package com.algorithm.leetcode.algorithm;

import java.util.Arrays;

public class MaximumUnits {

    public static void main(String[] args) {
        int[][] boxTypes = {{1, 3}, {2, 2}, {3, 1}};
        int truckSize = 4;
//        int[][] boxTypes = {{5, 10}, {2, 5}, {4, 7}, {3, 9}};
//        int truckSize = 10;
        int result = maximumUnits(boxTypes, truckSize);
        System.out.println(result);
    }

    public static int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a, b) -> Integer.compare(a[1], b[1]));
        int result = 0;
        for (int i = boxTypes.length - 1; i >= 0; i--) {
            if (truckSize == 0) {
                return result;
            }
            if (boxTypes[i][0] <= truckSize) {
                result += boxTypes[i][0] * boxTypes[i][1];
                truckSize -= boxTypes[i][0];
            } else {
                result += truckSize * boxTypes[i][1];
                truckSize = 0;
            }
        }
        return result;
    }
}
