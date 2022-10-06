package com.algorithm.leetcode.algorithm;

import java.util.HashMap;
import java.util.Map;

public class CountBalls {

    public static void main(String[] args) {
        int lowLimit = 1;
        int highLimit = 10;
//        int lowLimit = 5;
//        int highLimit = 15;
//        int lowLimit = 19;
//        int highLimit = 28;
        int result = countBalls(lowLimit, highLimit);
        System.out.println(result);
    }

    public static int countBalls(int lowLimit, int highLimit) {
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = lowLimit; i <= highLimit; i++) {
            int sum = getSum(i);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
            count = Math.max(count, map.get(sum));
        }
        return count;
    }

    private static int getSum(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
