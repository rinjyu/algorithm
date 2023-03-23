package com.algorithm.leetcode.algorithm;

import java.util.HashMap;
import java.util.Map;

public class MostFrequentEven {

    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 2, 4, 4, 1};
//        int[] nums = {4, 4, 4, 9, 2, 4};
//        int[] nums = {29, 47, 21, 41, 13, 37, 25, 7};
        int result = mostFrequentEven(nums);
        System.out.println(result);
    }

    public static int mostFrequentEven(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            if (i % 2 == 0) {
                map.put(i, map.getOrDefault(i, 0) + 1);
            }
        }
        int result = -1;
        int max = -1;
        for (Integer num : map.keySet()) {
            if (map.get(num) > max) {
                max = map.get(num);
                result = num;
            } else if (map.get(num) == max && result > num) {
                result = num;
            }
        }
        return result;
    }
}
