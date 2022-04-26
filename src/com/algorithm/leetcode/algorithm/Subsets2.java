package com.algorithm.leetcode.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets2 {

    public static void main(String[] args) {
        int[] nums = {1, 2, 2};
        List<List<Integer>> result = subsetsWithDup(nums);
        for (List<Integer> list : result) {
            System.out.println(Arrays.toString(list.toArray()));
        }
    }

    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        backtracking(nums, 0, new ArrayList<>(), result);
        return result;
    }

    private static void backtracking(int[] nums, int index, ArrayList<Integer> list, List<List<Integer>> result) {
        result.add(new ArrayList<>(list));
        for (int i = index; i < nums.length; i++) {
            if (i > index && nums[i] == nums[i - 1]) {
                continue;
            }
            list.add(nums[i]);
            backtracking(nums, i + 1, list, result);
            list.remove(list.size() - 1);
        }
    }
}