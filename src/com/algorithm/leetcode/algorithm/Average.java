package com.algorithm.leetcode.algorithm;

public class Average {

    public static void main(String[] args) {
        int[] salary = {4000, 3000, 1000, 2000};
//        int[] salary = {1000, 2000, 3000};
        double result = average(salary);
        System.out.println(result);
    }

    public static double average(int[] salary) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        for (int n : salary) {
            max = Math.max(max, n);
            min = Math.min(min, n);
        }
        for (int n : salary) {
            if (n != max && n != min) {
                sum += n;
            }
        }
        return (double) sum / (salary.length - 2);
    }
}
