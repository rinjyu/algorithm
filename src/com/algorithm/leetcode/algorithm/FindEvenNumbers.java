package com.algorithm.leetcode.algorithm;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class FindEvenNumbers {

    public static void main(String[] args) {
        int[] digits = {2, 1, 3, 0};
//        int[] digits = {2, 2, 8, 8, 2};
//        int[] digits = {3, 7, 5};
        int[] result = findEvenNumbers(digits);
        System.out.println(Arrays.toString(result));
    }

    public static int[] findEvenNumbers(int[] digits) {
        int length = digits.length;
        Set<Integer> set = new TreeSet<>();
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                for (int k = 0; k < length; k++) {
                    if (i != j && j != k && i != k) {
                        if (digits[i] != 0 && digits[k] % 2 == 0) {
                            int num = digits[i] * 100 + digits[j] * 10 + digits[k];
                            set.add(num);
                        }

                    }
                }
            }
        }
        int[] result = new int[set.size()];
        int count = 0;
        for (int i : set) {
            result[count] = i;
            count += 1;
        }
        return result;
    }
}
