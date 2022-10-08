package com.algorithm.leetcode.algorithm;

import java.util.*;
import java.util.stream.Collectors;

public class TwoOutOfThree {

    public static void main(String[] args) {
        int[] nums1 = {1, 1, 3, 2};
        int[] nums2 = {2, 3};
        int[] nums3 = {3};
//        int[] nums1 = {3, 1};
//        int[] nums2 = {2, 3};
//        int[] nums3 = {1, 2};
//        int[] nums1 = {1, 2, 2};
//        int[] nums2 = {4, 3, 3};
//        int[] nums3 = {5};
        List<Integer> result = twoOutOfThree(nums1, nums2, nums3);
        System.out.println(Arrays.toString(result.toArray()));
    }

    public static List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        Set<Integer> set1 = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
        Set<Integer> set2 = Arrays.stream(nums2).boxed().collect(Collectors.toSet());
        Set<Integer> set3 = Arrays.stream(nums3).boxed().collect(Collectors.toSet());
        Set<Integer> resultSet = new HashSet<>();
        for (int n : set1) {
            if (set2.contains(n)) {
                resultSet.add(n);
            } else if (set3.contains(n)) {
                resultSet.add(n);
            }
        }
        for (int n : set2) {
            if (set3.contains(n)) {
                resultSet.add(n);
            }
        }
        return new ArrayList<>(resultSet);
    }
}
