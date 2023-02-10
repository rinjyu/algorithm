package com.algorithm.leetcode.algorithm;

public class AverageValue {

    public static void main(String[] args) {
        int[] nums = {1, 3, 6, 10, 12, 15};
//        int[] nums = {1, 2, 4, 7, 10};
        int result = averageValue(nums);
        System.out.println(result);
    }

    public static int averageValue(int[] nums) {
        int count = 0;
        int sum = 0;
        for (int num : nums) {
            if (num % 6 == 0) {
                count++;
                sum += num;
            }
        }
        return count == 0 ? 0 : sum / count;
    }
}
