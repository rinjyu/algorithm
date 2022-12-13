package com.algorithm.leetcode.algorithm;

import java.util.HashMap;
import java.util.Map;

public class FindLucky {

    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 4};
//        int[] arr = {1, 2, 2, 3, 3, 3};
//        int[] arr = {2, 2, 2, 3, 3};
        int result = findLucky(arr);
        System.out.println(result);
    }

    public static int findLucky(int[] arr) {
        int result = -1;
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : arr) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        for (int n : map.keySet()) {
            if (n == map.get(n)) {
                result = Math.max(n, result);
            }
        }
        return result;
    }
}
