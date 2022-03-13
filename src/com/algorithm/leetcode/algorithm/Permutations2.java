package com.algorithm.leetcode.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Permutations2 {

    public static void main(String[] args) {
        int[] nums = {1, 1, 2};
        List<List<Integer>> result = permuteUnique(nums);
        System.out.println(Arrays.toString(result.toArray()));
    }

    public static List<List<Integer>> permuteUnique(int[] nums) {
        if (!isValidArray(nums)) {
            return new ArrayList<>();
        }
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        backtracking(nums, list, result, map);
        return result;
    }

    private static void backtracking(int[] nums, List<Integer> list, List<List<Integer>> result, Map<Integer, Integer> map) {
        if (list.size() == nums.length) {
            result.add(new ArrayList<>(list));
            return;
        }

        for (int i : map.keySet()) {
            if (map.get(i) > 0) {
                map.put(i, map.get(i) - 1);
                list.add(i);
                backtracking(nums, list, result, map);
                list.remove(list.size() - 1);
                map.put(i, map.get(i) + 1);
            }
        }
    }

    private static boolean isValidArray(int[] nums) {
        return !Objects.isNull(nums) && nums.length >= 1 && nums.length <= 8;
    }
}