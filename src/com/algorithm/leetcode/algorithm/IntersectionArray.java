package com.algorithm.leetcode.algorithm;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionArray {

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
//        int[] nums1 = {4, 9, 5};
//        int[] nums2 = {9, 4, 9, 8, 4};
        int[] result = intersection(nums1, nums2);
        System.out.println(Arrays.toString(result));
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> tempSet = new HashSet<>();
        Set<Integer> integerSet = new HashSet<>();
        for (int n : nums1) {
            tempSet.add(n);
        }
        for (int n : nums2) {
            if (tempSet.contains(n)) {
                integerSet.add(n);
            }
        }
        int[] result = new int[integerSet.size()];
        int i = 0;
        for (int n : integerSet) {
            result[i++] = n;
        }
        return result;
    }
}
