package com.algorithm.leetcode.algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindShortestSubArray {

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3, 1};
//        int[] nums = {1, 2, 2, 3, 1, 4, 2};
        int result = findShortestSubArray(nums);
        System.out.println(result);
    }

    public static int findShortestSubArray(int[] nums) {
        int max = 0;
        int min = Integer.MAX_VALUE;
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for (int n : nums) {
            list.add(n);
            map.put(n, map.getOrDefault(n, 0) + 1);
            if (map.get(n) > max) {
                max = map.get(n);
            }
        }
        for (Map.Entry m : map.entrySet()) {
            if ((int) m.getValue() == max) {
                int num = (int) m.getKey();
                int i = list.indexOf(num);
                int j = list.lastIndexOf(num);
                if (j - i + 1 < min) {
                    min = j - i + 1;
                }
            }
        }
        return min;
    }
}
