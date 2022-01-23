package com.algorithm.leetcode.algorithm;

import java.util.Arrays;

public class FindMedianSortedArrays {

    public static void main(String[] args) {
        int[] nums1 = {1,3};
        int[] nums2 = {2};
//        int[] nums1 = {1,2};
//        int[] nums2 = {3,4};
        double result = findMedianSortedArrays(nums1, nums2);
        System.out.println(result);
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (isValidArrayLength(nums1)) {
            return -1;
        }
        if (isValidArrayLength(nums2)) {
            return -1;
        }
        if (!isValidArraySumLength(nums1, nums2)) {
            return -1;
        }

        int length = nums1.length + nums2.length;
        int[] array = new int[length];
        System.arraycopy(nums1, 0, array, 0, nums1.length);
        System.arraycopy(nums2, 0, array, nums1.length, nums2.length);

        Arrays.sort(array);

        if (length % 2 == 0) {
            return (double)(array[length / 2] + array[length / 2 - 1]) / 2;
        } else {
            return array[length / 2];
        }
    }

    public static boolean isValidArrayLength(int[] nums) {
        return nums.length > 1000;
    }

    public static boolean isValidArraySumLength(int[] nums1, int[] nums2) {
        return (nums1.length + nums2.length) >= 1 && (nums1.length + nums2.length) <= 2000;
    }
}
