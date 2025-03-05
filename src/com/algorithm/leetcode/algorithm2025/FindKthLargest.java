package com.algorithm.leetcode.algorithm2025;

import java.util.PriorityQueue;

public class FindKthLargest {

    public static void main(String[] args) {

//        int[] nums = {3, 2, 1, 5, 6, 4};
//        int k = 2;
        int[] nums = {3, 2, 3, 1, 2, 4, 5, 5, 6};
        int k = 4;
        System.out.println(findKthLargest(nums, k));
    }

    public static int findKthLargest(int[] nums, int k) {

//        Arrays.sort(nums);
//        return nums[nums.length - k];

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(k);
        for (int num : nums) {
            if (priorityQueue.size() < k) {
                priorityQueue.offer(num);
            } else if (num > priorityQueue.peek()) {
                priorityQueue.poll();
                priorityQueue.offer(num);
            }
        }

        return priorityQueue.peek();
    }
}
