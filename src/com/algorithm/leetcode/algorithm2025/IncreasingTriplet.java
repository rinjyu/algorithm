package com.algorithm.leetcode.algorithm2025;

public class IncreasingTriplet {

    public static void main(String[] args) {

//        int[] nums = {1,2,3,4,5};
//        int[] nums = {5,4,3,2,1};
//        int[] nums = {2,1,5,0,4,6};
        int[] nums = {20,100,10,12,5,13};
        System.out.println(increasingTriplet(nums));
    }

    public static boolean increasingTriplet(int[] nums) {

        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num <= first) {
                first = num;
            } else if (num <= second) {
                second = num;
            } else {
                return true;
            }
        }

        return false;
    }
}
