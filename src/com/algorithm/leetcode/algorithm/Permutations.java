package com.algorithm.leetcode.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Permutations {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
//        int[] nums = {0, 1};
//        int[] nums = {1};
        List<List<Integer>> result = permute(nums);
        System.out.println(Arrays.toString(result.toArray()));
    }

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        for (Integer integer: nums) {
            list.add(integer);
        }
        recursive(result, list, 0, nums.length);
        return result;
    }

    private static void recursive(List<List<Integer>> result, List<Integer> list, int currentIndex, int length) {
        if (currentIndex == length) {
            result.add(list);
            return;
        }
        for (int i = currentIndex; i < length; i++) {
            Collections.swap(list, i, currentIndex);
            recursive(result, new ArrayList<>(list), currentIndex + 1, length);
        }
    }
}