package com.algorithm.leetcode.algorithm2025;

import java.util.Arrays;

public class EraseOverlapIntervals {

    public static void main(String[] args) {

        int[][] intervals = {{1, 2}, {2, 3}, {3, 4}, {1, 3}};
        System.out.println(eraseOverlapIntervals(intervals));
    }

    public static int eraseOverlapIntervals(int[][] intervals) {

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));
        int count = 0;
        int prevLast = intervals[0][1];
        for (int i = 1; i < intervals.length; i++) {
            int start = intervals[i][0];
            int end = intervals[i][1];
            if (start < prevLast) {
                count++;
            } else {
                prevLast = end;
            }
        }

        return count;
    }
}
