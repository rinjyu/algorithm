package com.algorithm.leetcode.algorithm2025;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDifference {

    public static void main(String[] args) {

//        int[] nums1 = {1,2,3};
//        int[] nums2 = {2,4,6};

        int[] nums1 = {1,2,3,3};
        int[] nums2 = {1,1,2,2};
        System.out.println(findDifference(nums1, nums2));
    }

    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        Set<Integer> set1 = new HashSet<>(Arrays.stream(nums1).boxed().collect(Collectors.toList()));
        Set<Integer> set2 = new HashSet<>(Arrays.stream(nums2).boxed().collect(Collectors.toList()));

        List<Integer> list1 = set1.stream().filter(num -> !set2.contains(num)).collect(Collectors.toList());
        List<Integer> list2 = set2.stream().filter(num -> !set1.contains(num)).collect(Collectors.toList());

        return Arrays.asList(list1, list2);
    }
}
