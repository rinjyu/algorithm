package com.algorithm.leetcode.algorithm2025;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class DailyTemperature {

    public static void main(String[] args) {

//        int[] temperature = {73, 74, 75, 71, 69, 72, 76, 73};
//        int[] temperature = {30, 40, 50, 60};
        int[] temperature = {30, 60, 90};
        dailyTemperatures(temperature);
    }

    public static int[] dailyTemperatures(int[] temperatures) {

//        int[] result = new int[temperatures.length];
//        for (int i = 0; i < temperatures.length; i++) {
//            if (i == temperatures.length - 1) {
//                result[i] = 0;
//                break;
//            }
//            int current = temperatures[i];
//            for (int j = i + 1; j < temperatures.length; j++) {
//                int next = temperatures[j];
//                if (current < next) {
//                    result[i] = j - i;
//                    break;
//                }
//            }
//        }
//
//        System.out.println(Arrays.toString(result));
//        return result;

        int[] result = new int[temperatures.length];
        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i < temperatures.length ; i++) {
            while (!deque.isEmpty() && temperatures[i] > temperatures[deque.peek()]) {
                int prev = deque.pop();
                result[prev] = i - prev;
            }

            deque.push(i);
        }

        System.out.println(Arrays.toString(result));
        return result;
    }
}
