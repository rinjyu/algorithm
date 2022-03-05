package com.algorithm.leetcode.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum2 {

    public static void main(String[] args) {
        int[] candidates = {10, 1, 2, 7, 6, 1, 5};
        int target = 8;
//        int[] candidates = {2, 5, 2, 1, 2};
//        int target = 5;
        List<List<Integer>> result = combinationSum2(candidates, target);
        System.out.println(Arrays.toString(result.toArray()));
    }

    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList<>();
        backtracking(candidates, target, 0, result, new ArrayList<>());
        return result;
    }

    private static void backtracking(int[] candidates, int target, int index, List<List<Integer>> result, List<Integer> list) {
        if (target == 0) {
            result.add(new ArrayList<>(list));
            return;
        }
        if (index == candidates.length) {
            return;
        }
        if (target < 0) {
            return;
        }

        int i = index;
        while (i < candidates.length) {
            if (candidates[i] != candidates[index]) {
                break;
            }
            i++;
        }
        backtracking(candidates, target, i, result, list);
        list.add(candidates[index]);
        backtracking(candidates, target - candidates[index], index + 1, result, list);
        list.remove(list.size() - 1);
    }
}