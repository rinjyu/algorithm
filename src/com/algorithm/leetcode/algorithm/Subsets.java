package com.algorithm.leetcode.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Subsets {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
//        int[] nums = {0};
        List<List<Integer>> result = subsets(nums);
        for (List<Integer> integers : result) {
            System.out.println(Arrays.toString(integers.toArray()));
        }
    }

    public static List<List<Integer>> subsets(int[] nums) {
        if (!isValidArrayLength(nums)) {
            return new ArrayList<>();
        }
        List<List<Integer>> result = new ArrayList<>(new ArrayList<>());
        List<Integer> list = new ArrayList<>();
        backtracking(nums, 0, list, result);
        return result;
    }

    private static void backtracking(int[] nums, int index, List<Integer> list, List<List<Integer>> result) {
        result.add(new ArrayList<>(list));
        for (int i = index; i < nums.length; i++) {
            list.add(nums[i]);
            backtracking(nums, i + 1, list, result);
            list.remove(list.size() - 1);
        }
    }

    private static boolean isValidArrayLength(int[] nums) {
        return !Objects.isNull(nums) && nums.length >= 1 && nums.length <= 10;
    }
}
