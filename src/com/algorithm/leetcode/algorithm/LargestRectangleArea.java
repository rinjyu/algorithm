package com.algorithm.leetcode.algorithm;

import java.util.Stack;

public class LargestRectangleArea {

    public static void main(String[] args) {
        int[] heights = {2, 1, 5, 6, 2, 3};
//        int[] heights = {2, 4};
        int result = largestRectangleArea(heights);
        System.out.println(result);
    }

    public static int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int length = heights.length;
        int result = 0;
        for (int i = 0; i < length; i++) {
            while (!stack.empty() && heights[stack.peek()] >= heights[i]) {
                int value = heights[stack.pop()];
                int left = stack.empty() ? -1 : stack.peek();
                result = Math.max((i - left - 1) * value, result);
            }
            stack.push(i);
        }
        while (!stack.empty()) {
            int value = heights[stack.pop()];
            int left = stack.empty() ? -1 : stack.peek();
            result = Math.max((length - left - 1) * value, result);
        }
        return result;
    }
}