package com.algorithm.leetcode.algorithm2025;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    public static void main(String[] args) {

//        String s = "III";
//        String s = "LVIII";
        String s = "MCMXCIV";
        System.out.println(romanToInt(s));
    }

    public static int romanToInt(String s) {

        Map<String, Integer> symbol = new HashMap<>();
        symbol.put("I", 1);
        symbol.put("V", 5);
        symbol.put("X", 10);
        symbol.put("L", 50);
        symbol.put("C", 100);
        symbol.put("D", 500);
        symbol.put("M", 1000);

        String[] arr = s.split("");
        int prev = 0;
        int result = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            int current = symbol.get(arr[i]);
            if (current >= prev) {
                result += current;
            } else {
                result -= current;
            }

            prev = current;
        }

        return result;
    }
}
