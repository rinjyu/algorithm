package com.algorithm.leetcode.algorithm;

import java.util.*;

public class PascalTriangle2 {

    public static void main(String[] args) {
        int rowIndex = 3;
//        int rowIndex = 0;
//        int rowIndex = 1;
        List<Integer> result = getRow(rowIndex);
        System.out.println(Arrays.toString(result.toArray()));
    }

    public static List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i <= rowIndex; i++) {
            result.add(backtracking(i, rowIndex, map));
        }
        return result;
    }

    private static int backtracking(int i, int rowIndex, Map<String, Integer> map) {
        if (i == 0 || rowIndex == 0 || i == rowIndex) {
            return 1;
        }

        String key = String.join(",", Integer.toString(i), Integer.toString(rowIndex));
        if (map.containsKey(key)) {
            return map.get(key);
        }
        int num = backtracking(i, rowIndex - 1, map) + backtracking(i - 1, rowIndex - 1, map);
        map.put(key, num);
        return num;
    }
}
