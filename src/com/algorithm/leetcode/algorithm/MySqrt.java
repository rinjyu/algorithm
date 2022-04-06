package com.algorithm.leetcode.algorithm;

public class MySqrt {

    public static void main(String[] args) {
        int x = 4;
//        int x = 8;
        int result = mySqrt(x);
        System.out.println(result);
    }

    public static int mySqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }
        int left = 0;
        int right = x;
        while (left + 1 < right) {
            int middle = left + (right - left) / 2;
            if (middle == x / middle) {
                return middle;
            } else if (middle > x / middle) {
                right = middle;
            } else {
                left = middle;
            }
        }
        if (right <= x / right) {
            return right;
        }
        return left;
    }
}