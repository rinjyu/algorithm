package com.algorithm.leetcode.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class InsertInterval {

    public static void main(String[] args) {
        int[][] intervals = {{1, 3}, {6, 9}};
        int[] newInterval = {2, 5};
//        int[][] intervals = {{1, 2}, {3, 5}, {6, 7}, {8, 10}, {12, 16}};
//        int[] newInterval = {4, 8};
        int[][] result = insert(intervals, newInterval);
        for (int[] ints : result) {
            System.out.println(Arrays.toString(ints));
        }
    }

    public static int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> list = new ArrayList<>();
        if (!isValidArray(intervals)) {
            return list.toArray(new int[0][2]);
        }
        boolean isAdded = false;
        for (int[] interval : intervals) {
            if (!isAdded && interval[1] >= newInterval[0]) {
                isAdded = true;
                if (newInterval[1] < interval[0]) {
                    list.add(newInterval);
                    list.add(interval);
                } else {
                    list.add(new int[]{
                        Math.min(interval[0], newInterval[0]),
                        Math.max(interval[1], newInterval[1])
                    });
                }
            } else {
                if (list.isEmpty() || interval[0] > list.get(list.size() - 1)[1]) {
                    list.add(interval);
                } else {
                    list.get(list.size() - 1)[1] = Math.max(list.get(list.size() - 1)[1], interval[1]);
                }
            }
        }
        if (!isAdded) {
            list.add(newInterval);
        }
        return list.toArray(new int[list.size()][2]);
    }

    private static boolean isValidArray(int[][] intervals) {
        return !Objects.isNull(intervals) && intervals.length <= 10000;
    }
}