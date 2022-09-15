package com.algorithm.leetcode.algorithm;

import java.util.HashMap;
import java.util.Map;

public class DigitCount {

    public static void main(String[] args) {
        String num = "1210";
//        String num = "030";
        boolean result = digitCount(num);
        System.out.println(result);
    }

    public static boolean digitCount(String num) {
        Map<Integer, Integer> map = new HashMap<>();
        for (char c : num.toCharArray()) {
            map.put(c - '0', map.getOrDefault(c - '0', 0) + 1);
        }
        for (int i = 0; i < num.length(); i++) {
            int checkNumber = num.charAt(i) - '0';
            int currentNumber = map.getOrDefault(i, 0);
            if (currentNumber != checkNumber) return false;
        }
        return true;
    }
}
