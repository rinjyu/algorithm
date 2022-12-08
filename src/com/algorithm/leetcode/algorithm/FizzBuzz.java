package com.algorithm.leetcode.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FizzBuzz {

    public static void main(String[] args) {
        int n = 3;
//        int n = 5;
//        int n = 15;
        List<String> result = fizzBuzz(n);
        System.out.println(Arrays.toString(result.toArray()));
    }

    public static List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            result.add(getWord(i));
        }
        return result;
    }

    public static String getWord(int i) {
        if (i % 15 == 0) {
            return "FizzBuzz";
        }
        if (i % 5 == 0) {
            return "Buzz";
        }
        if (i % 3 == 0) {
            return "Fizz";
        }
        return String.valueOf(i);
    }
}
