package com.algorithm.leetcode.algorithm;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class NumberOfPairs {

    public static void main(String[] args) {
        int[] nums = {1, 3, 2, 1, 3, 2, 2};
//       int[] nums = {1, 1};
//       int[] nums = {0};
        int[] result = numberOfPairs(nums);
        System.out.println(Arrays.toString(result));
    }

    public static int[] numberOfPairs(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        int[] result = new int[]{0, 0};
        for (int i = 0; i <= 100; i++) {
            int num = map.getOrDefault(i, 0);
            result[0] += num / 2;
            result[1] += num % 2;
        }
        return result;
    }
}
