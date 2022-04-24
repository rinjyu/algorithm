package com.algorithm.leetcode.algorithm;

import java.util.Arrays;

public class MergeSortedArray {

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;
//        int[] nums1 = {1};
//        int m = 1;
//        int[] nums2 = {};
//        int n = 0;
//        int[] nums1 = {0};
//        int m = 0;
//        int[] nums2 = {1};
//        int n = 1;
        merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        for (int j = m; j < nums1.length; j++) {
            nums1[j] = nums2[i++];
        }
        Arrays.sort(nums1);
    }
}