package com.algorithm.leetcode.algorithm;

import java.util.Objects;
import java.util.Stack;

public class MaximalRectangle {

    public static void main(String[] args) {
        char[][] matrix = {
                {'1', '0', '1', '0', '0'},
                {'1', '0', '1', '1', '1'},
                {'1', '1', '1', '1', '1'},
                {'1', '0', '0', '1', '0'}
        };
//        char[][] matrix = {{'0'}};
//        char[][] matrix = {{'1'}};
        int result = maximalRectangle(matrix);
        System.out.println(result);
    }

    public static int maximalRectangle(char[][] matrix) {
        if (!isValidArray(matrix)) {
            return 0;
        }
        int max = 0;
        int m = matrix.length;
        int n = matrix[0].length;
        int[] histogram = new int[n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == '0') {
                    histogram[j] = 0;
                } else {
                    histogram[j] += (matrix[i][j] - '0');
                }
            }
            max = Math.max(max, maximalRectangleArea(histogram));
        }
        return max;
    }

    public static int maximalRectangleArea(int[] heights) {
        int maxArea = 0;
        int length = heights.length;
        int currentArea;
        Stack<Integer> stack = new Stack<>();
        int i = 0;
        for (; i < length; i++) {
            if (stack.isEmpty() || heights[i] >= heights[stack.peek()]) {
                stack.push(i);
            } else {
                int pop = stack.pop();
                if (stack.isEmpty()) {
                    currentArea = heights[pop] * i;
                } else {
                    currentArea = heights[pop] * (i - stack.peek() - 1);
                }
                maxArea = Math.max(maxArea, currentArea);
                i--;
            }
        }
        while (!stack.isEmpty()) {
            int pop = stack.pop();
            if (stack.isEmpty()) {
                currentArea = heights[pop] * i;
            } else {
                currentArea = heights[pop] * (i - stack.peek() - 1);
            }
            maxArea = Math.max(maxArea, currentArea);
        }
        return maxArea;
    }

    private static boolean isValidArray(char[][] matrix) {
        return !Objects.isNull(matrix);
    }
}