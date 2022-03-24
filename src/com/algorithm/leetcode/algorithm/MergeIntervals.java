package com.algorithm.leetcode.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class MergeIntervals {

    public static void main(String[] args) {
        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
//        int[][] intervals = {{1, 4}, {4, 5}};
        int[][] result = merge(intervals);
        for (int[] ints : result) {
            System.out.println(Arrays.toString(ints));
        }
    }

    public static int[][] merge(int[][] intervals) {
        List<int[]> result = new ArrayList<>();
        if (!isValidArray(intervals)) {
            return result.toArray(new int[0][]);
        }
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        int start = intervals[0][0];
        int end = intervals[0][1];
        for (int[] i : intervals) {
            if (i[0] <= end) {
                end = Math.max(end, i[1]);
            } else {
                result.add(new int[]{start, end});
                start = i[0];
                end = i[1];
            }
        }
        result.add(new int[]{start, end});
        return result.toArray(new int[0][]);
    }

    private static boolean isValidArray(int[][] intervals) {
        return !Objects.isNull(intervals) && intervals.length >= 1 && intervals.length <= 10000;
    }
}