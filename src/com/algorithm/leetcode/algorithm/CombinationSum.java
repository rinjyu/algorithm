package com.algorithm.leetcode.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {

    public static void main(String[] args) {
        int[] candidates = {2, 3, 6, 7};
        int target = 7;
        List<List<Integer>> result = combinationSum(candidates, target);
        System.out.println(Arrays.toString(result.toArray()));
    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtracking(candidates, target, 0, result, new ArrayList<>());
        return result;
    }

    private static void backtracking(int[] candidates, int target, int index, List<List<Integer>> result, List<Integer> list) {
        if (target == 0) {
            result.add(list);
        }
        if (target < 0) {
            return;
        }
        for (int i = index; i < candidates.length; i++) {
            List<Integer> tempList = new ArrayList<>(list);
            tempList.add(candidates[i]);
            backtracking(candidates, target - candidates[i], i, result, tempList);
        }
    }
}