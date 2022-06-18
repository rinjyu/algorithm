package com.algorithm.leetcode.algorithm;

public class ValidPerfectSquare {

    public static void main(String[] args) {
        int num = 16;
//        int num = 14;
        boolean result = isPerfectSquare(num);
        System.out.println(result);
    }

    public static boolean isPerfectSquare(int num) {
        long first = 0;
        long last = num;
        while (first <= last) {
            long middle = first + ((last - first) / 2);
            if (middle * middle == num) {
                return true;
            }
            if (middle * middle > num) {
                last = middle - 1;
            } else {
                first = middle + 1;
            }
        }
        return false;
    }
}
