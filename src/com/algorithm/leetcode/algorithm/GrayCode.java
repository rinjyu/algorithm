package com.algorithm.leetcode.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GrayCode {

    public static void main(String[] args) {
        int n = 2;
//        int n = 1;
        List<Integer> result = grayCode(n);
        System.out.println(Arrays.toString(result.toArray()));
    }

    public static List<Integer> grayCode(int n) {
        if (!isValidNumber(n)) {
            return new ArrayList<>();
        }
        List<Integer> result = new ArrayList<>();
        result.add(0);
        for (int i = 0; i < n; i++) {
            for (int j = result.size() - 1; j >= 0; j--) {
                result.add((1 << i) + result.get(j));
            }
        }
        return result;
    }

    private static boolean isValidNumber(int n) {
        return n >= 1 && n <= 16;
    }
}
