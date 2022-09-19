package com.algorithm.leetcode.algorithm;

import java.util.*;

public class Intersect {

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
//        int[] nums1 = {4, 9, 5};
//        int[] nums2 = {9, 4, 9, 8, 4};
        int[] result = intersect(nums1, nums2);
        System.out.println(Arrays.toString(result));
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums1) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for (int i : nums2) {
            if (map.getOrDefault(i, 0) != 0) {
                list.add(i);
                map.put(i, map.getOrDefault(i, 1) - 1);
            }
        }
        int[] result = new int[list.size()];
        int i = 0;
        for (int j : list) {
            result[i++] = j;
        }
        return result;
    }
}
