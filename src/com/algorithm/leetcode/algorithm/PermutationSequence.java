package com.algorithm.leetcode.algorithm;

import java.util.ArrayList;
import java.util.List;

public class PermutationSequence {

    public static void main(String[] args) {
        int n = 3;
        int k = 3;
//        int n = 4;
//        int k = 9;
//        int n = 3;
//        int k = 1;
        String result = getPermutation(n, k);
        System.out.println(result);
    }

    public static String getPermutation(int n, int k) {
        if (!isValidNumber(n)) {
            return "";
        }
        List<Integer> list = new ArrayList<>();
        StringBuilder result = new StringBuilder();
        int factorial = 1;
        for (int i = 1; i < n; i++) {
            list.add(i);
            factorial *= i;
        }
        list.add(n);
        k--;
        while (true) {
            result.append(list.get(k / factorial));
            list.remove(k / factorial);
            if (list.size() == 0) {
                break;
            }
            k %= factorial;
            factorial = factorial / list.size();
        }
        return result.toString();
    }

    private static boolean isValidNumber(int n) {
        return n >= 1 && n <= 9;
    }
}