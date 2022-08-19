package com.algorithm.leetcode.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SelfDividingNumbers {

    public static void main(String[] args) {
        int left = 1;
        int right = 22;
//        int left = 47;
//        int right = 85;
        List<Integer> result = selfDividingNumbers(left, right);
        System.out.println(Arrays.toString(result.toArray()));
    }

    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<>();
        for (int i = left, j; i <= right; i++) {
            for (j = i; j > 0; j /= 10) {
                if (j % 10 == 0 || i % (j % 10) != 0) {
                    break;
                }
            }
            if (j == 0) {
                result.add(i);
            }
        }
        return result;
    }
}
