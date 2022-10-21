package com.algorithm.leetcode.algorithm;

import java.util.*;

public class FindDifference {

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {2, 4, 6};
//        int[] nums1 = {1, 2, 3, 3};
//        int[] nums2 = {1, 1, 2, 2};
        List<List<Integer>> result = findDifference(nums1, nums2);
        for (List<Integer> list : result) {
            System.out.println(Arrays.toString(list.toArray()));
        }
    }

    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set set1 = new HashSet<>();
        Set set2 = new HashSet<>();
        for (int n : nums1) {
            set1.add(n);
        }
        for (int n : nums2) {
            set2.add(n);
        }
        Set<Integer> set3 = new HashSet<>();
        for (int n : nums1) {
            if (!set2.contains(n)) {
                set3.add(n);
            }
        }
        Set<Integer> set4 = new HashSet<>();
        for (int n : nums2) {
            if (!set1.contains(n)) {
                set4.add(n);
            }
        }
        return Arrays.asList(new ArrayList<>(set3), new ArrayList<>(set4));
    }
}
