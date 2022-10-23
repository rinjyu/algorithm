package com.algorithm.leetcode.algorithm;

import java.util.*;

public class FrequencySort {

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 2, 3};
//        int[] nums = {2, 3, 1, 3, 2};
//        int[] nums = {-1, 1, -6, 4, 5, -6, 1, 4, 1};
        int[] result = frequencySort(nums);
        System.out.println(Arrays.toString(result));
    }

    public static int[] frequencySort(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        List<Integer> list = new ArrayList<>(map.keySet());
        Collections.sort(list, (a, b) -> (map.get(a) == map.get(b)) ? b - a : map.get(a) - map.get(b));
        int[] result = new int[nums.length];
        int i = 0;
        for (int n : list) {
            for (int j = 0; j < map.get(n); j++) {
                result[i++] = n;
            }
        }
        return result;
    }
}
