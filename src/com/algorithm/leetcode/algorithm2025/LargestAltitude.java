package com.algorithm.leetcode.algorithm2025;

public class LargestAltitude {

    public static void main(String[] args) {

//        int[] gain = {-5,1,5,0,-7};
        int[] gain = {-4,-3,-2,-1,4,3,2};
        System.out.println(largestAltitude(gain));
    }

    public static int largestAltitude(int[] gain) {

        int max = 0;
        int current = 0;
        for (int n : gain) {
            int sum = current + n;
            if (sum > max) {
                max = sum;
            }
            current = sum;
        }

        return max;
    }
}
