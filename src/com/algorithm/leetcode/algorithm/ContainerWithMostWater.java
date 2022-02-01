package com.algorithm.leetcode.algorithm;

public class ContainerWithMostWater {

    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
//        int[] height = {1,1};
        int result = maxArea(height);
        System.out.println(result);
    }

    public static int maxArea(int[] height) {
        int max = 0;
        int left = 0;
        int right = height.length - 1;
        while (left < right) {
            int current = Math.min(height[left], height[right]) * (right - left);
            max = Math.max(max, current);
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return max;
    }
}
