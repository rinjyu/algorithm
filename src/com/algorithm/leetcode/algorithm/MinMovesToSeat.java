package com.algorithm.leetcode.algorithm;

import java.util.Arrays;

public class MinMovesToSeat {

    public static void main(String[] args) {
        int[] seats = {3, 1, 5};
        int[] students = {2, 7, 4};
//        int[] seats = {4, 1, 5, 9};
//        int[] students = {1, 3, 2, 6};
//        int[] seats = {2, 2, 6, 6};
//        int[] students = {1, 3, 2, 6};
        int result = minMovesToSeat(seats, students);
        System.out.println(result);
    }

    public static int minMovesToSeat(int[] seats, int[] students) {
        int result = 0;
        Arrays.sort(seats);
        Arrays.sort(students);
        for (int i = 0; i < seats.length; i++) {
            result += Math.abs(seats[i] - students[i]);
        }
        return result;
    }
}