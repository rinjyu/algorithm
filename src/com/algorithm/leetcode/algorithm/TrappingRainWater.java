package com.algorithm.leetcode.algorithm;

public class TrappingRainWater {

    public static void main(String[] args) {
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
//        int[] height = {4, 2, 0, 3, 2, 5};
        int result = trap(height);
        System.out.println(result);
    }

    public static int trap(int[] height) {
        int result = 0;
        int left = 0;
        int right = height.length - 1;
        int maxLeft = height[left];
        int maxRight = height[right];
        while (left < right) {
            if (maxLeft < maxRight) {
                left++;
                maxLeft = Math.max(maxLeft, height[left]);
                result += maxLeft - height[left];
            } else {
                right--;
                maxRight = Math.max(maxRight, height[right]);
                result += maxRight - height[right];
            }
        }
        return result;
    }
}