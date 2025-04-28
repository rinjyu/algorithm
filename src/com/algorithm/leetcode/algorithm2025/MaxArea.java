package com.algorithm.leetcode.algorithm2025;

public class MaxArea {

    public static void main(String[] args) {

        int[] heigth = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(maxArea(heigth));
    }

    public static int maxArea(int[] height) {

        int maxArea = 0;
        int left = 0;
        int right = height.length - 1;
        while (left < right) {
            int currentArea = (right - left) * Math.min(height[left], height[right]);
            maxArea = Math.max(maxArea, currentArea);
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
}
