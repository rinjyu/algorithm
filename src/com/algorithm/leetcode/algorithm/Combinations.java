package com.algorithm.leetcode.algorithm;

import java.util.ArrayList;
import java.util.List;

public class Combinations {

    public static void main(String[] args) {
        int n = 4;
        int k = 2;
//        int n = 1;
//        int k = 1;
        List<List<Integer>> result = combine(n, k);
        for (List<Integer> integers : result) {
            System.out.println(integers.toString());
        }
    }

    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        if (k > n) {
            return result;
        }
        List<Integer> list = new ArrayList<>();
        repeatCombine(n, k, 1, list, result);
        return result;
    }

    private static void repeatCombine(int n, int k, int index, List<Integer> list, List<List<Integer>> result) {
        if (k == 0) {
            result.add(new ArrayList<>(list));
            return;
        }
        for (int i = index; i <= n; i++) {
            list.add(i);
            repeatCombine(n, k - 1, i + 1, list, result);
            list.remove(list.size() - 1);
        }
    }
}