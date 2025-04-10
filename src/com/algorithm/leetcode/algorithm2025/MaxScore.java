package com.algorithm.leetcode.algorithm2025;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class MaxScore {

    public static void main(String[] args) {

        int[] nums1 = {1, 3, 3, 2};
        int[] nums2 = {2, 1, 3, 4};
        int k = 3;
        System.out.println(maxScore(nums1, nums2, k));
    }

    public static long maxScore(int[] nums1, int[] nums2, int k) {

        int length = nums1.length;
        List<int[]> pairs = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            pairs.add(new int[]{nums2[i], nums1[i]});
        }

        pairs.sort(Comparator.comparingInt(pair -> -pair[0]));
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        long sum = 0L;
        long max = 0L;

        for (int[] pair : pairs) {
            int min = pair[0];
            int value = pair[1];

            queue.offer(value);
            sum  += value;
            if (queue.size() > k) {
                sum -= queue.poll();
            }

            if (queue.size() == k) {
                long score = sum * min;
                max = Math.max(max, score);
            }
        }

        return max;
    }
}
