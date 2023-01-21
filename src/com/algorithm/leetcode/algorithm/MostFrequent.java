package com.algorithm.leetcode.algorithm;

import java.util.HashMap;
import java.util.Map;

public class MostFrequent {

    public static void main(String[] args) {
        int[] nums = {1, 100, 200, 1, 100};
        int key = 1;
//        int[] nums = {2, 2, 2, 2, 3};
//        int key = 2;
        int result = mostFrequent(nums, key);
        System.out.println(result);
    }

    public static int mostFrequent(int[] nums, int key) {
        Map<Integer, Integer> map = new HashMap<>();
        int mostFrequent = -1;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == key) {
                if (!map.containsKey(nums[i + 1])) {
                    map.put(nums[i + 1], 1);
                } else {
                    int temp = map.get(nums[i + 1]);
                    map.put(nums[i + 1], ++temp);
                }
                if (map.get(nums[i + 1]) > max) {
                    max = map.get(nums[i + 1]);
                    mostFrequent = nums[i + 1];
                }
            }
        }
        return mostFrequent;
    }
}
