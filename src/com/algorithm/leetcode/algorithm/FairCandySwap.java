package com.algorithm.leetcode.algorithm;

import java.util.Arrays;

public class FairCandySwap {

    public static void main(String[] args) {
        int[] aliceSizes = {1, 1};
        int[] bobSizes = {2, 2};
//        int[] aliceSizes = {1, 2};
//        int[] bobSizes = {2, 3};
//        int[] aliceSizes = {2};
//        int[] bobSizes = {1, 3};
        int[] result = fairCandySwap(aliceSizes, bobSizes);
        System.out.println(Arrays.toString(result));
    }

    public static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int totalAliceSizes = 0;
        int totalBobSizes = 0;
        for (int n : aliceSizes) {
            totalAliceSizes += n;
        }
        for (int n : bobSizes) {
            totalBobSizes += n;
        }
        Arrays.sort(aliceSizes);
        int divide = (totalAliceSizes - totalBobSizes) / 2;
        int target = 0;
        for (int n : bobSizes) {
            target = divide + n;
            if (binarySearch(aliceSizes, target) != -1) {
                return new int[]{target, n};
            }
        }
        return null;
    }

    private static int binarySearch(int[] aliceSizes, int target) {
        int i = 0;
        int length = aliceSizes.length - 1;
        while (i <= length) {
            int mid = i + (length - i) / 2;
            if (aliceSizes[mid] == target) {
                return mid;
            } else if (aliceSizes[mid] < target) {
                i = mid + 1;
            } else {
                length = mid - 1;
            }
        }
        return -1;
    }
}
