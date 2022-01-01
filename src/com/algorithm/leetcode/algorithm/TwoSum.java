package com.algorithm.leetcode.algorithm;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 15};
        int target = 9;
//        int[] numbers = {3, 2, 4};
//        int target = 6;
//        int[] numbers = {3, 3};
//        int target = 6;
        int[] result = twoSum(numbers, target);
        System.out.println(Arrays.toString(result));
    }

    public static int[] twoSum(int[] numbers, int target) {
        if (!validateArray(numbers)) {
            return null;
        }

        if (!validateNumber(target)) {
            return null;
        }

        Map<Integer, Integer> integerMap = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            if (validateNumber(numbers[i]) && integerMap.containsKey(target - numbers[i])) {
                return new int[]{integerMap.get(target - numbers[i]), i};
            }
            integerMap.put(numbers[i], i);
        }
        return null;
    }

    private static boolean validateArray(int[] numbers) {
        return numbers.length >= 2 && numbers.length <= 10000;
    }

    private static boolean validateNumber(int number) {
        return number >= -1000000000 && number <= 1000000000;
    }
}
