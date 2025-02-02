package com.algorithm.leetcode.algorithm2025;

import java.util.*;

public class EqualPairs {

    public static void main(String[] args) {

//        int[][] grid = {{3, 2, 1}, {1, 7, 6}, {2, 7, 7}};
        int[][] grid = {{3, 1, 2, 2}, {1, 4, 4, 5}, {2, 4, 2, 2}, {2, 4, 2, 2}};
        System.out.println(equalPairs(grid));
    }

    public static int equalPairs(int[][] grid) {

        int length = grid.length;
        Map<List<Integer>, Integer> rowMap = new HashMap<>();

        for (int i = 0; i < length; i++) {
            List<Integer> row = Arrays.asList(Arrays.stream(grid[i]).boxed().toArray(Integer[]::new));
            rowMap.put(row, rowMap.getOrDefault(row, 0) + 1);
        }

        int count = 0;
        for (int j = 0; j < length; j++) {
            List<Integer> column = new ArrayList<>();
            for (int i = 0; i < length; i++) {
                column.add(grid[i][j]);
            }
            count += rowMap.getOrDefault(column, 0);
        }

        return count;
    }
}
