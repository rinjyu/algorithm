package com.algorithm.leetcode.algorithm;

public class CountEven {

    public static void main(String[] args) {
        int num = 4;
//        int num = 30;
        int result = countEven(num);
        System.out.println(result);
    }

    public static int countEven(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            int digitSum = 0;
            int n = i;
            while (n > 0) {
                digitSum += n % 10;
                n /= 10;
            }
            if (digitSum % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
