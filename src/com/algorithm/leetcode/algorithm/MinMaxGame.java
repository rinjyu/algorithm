package com.algorithm.leetcode.algorithm;

import java.util.LinkedList;
import java.util.Queue;

public class MinMaxGame {

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 2, 4, 8, 2, 2};
//        int[] nums = {3};
        int result = minMaxGame(nums);
        System.out.println(result);
    }

    public static int minMaxGame(int[] nums) {
        Queue<Integer> queue = new LinkedList();
        for (int n : nums) {
            queue.add(n);
        }
        boolean isMinimum = true;
        while (queue.size() != 1) {
            int i = queue.poll();
            int j = queue.poll();
            if (isMinimum) {
                queue.add(Math.min(i, j));
            } else {
                queue.add(Math.max(i, j));
            }
            isMinimum = !isMinimum;
        }
        return queue.poll();
    }
}
