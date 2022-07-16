package com.algorithm.leetcode.algorithm;

import java.util.Objects;

public class SumOddLengthSubarrays {

    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 5, 3};
//        int[] arr = {1, 2};
//        int[] arr = {10, 11, 12};
        int result = sumOddLengthSubarrays(arr);
        System.out.println(result);
    }

    public static int sumOddLengthSubarrays(int[] arr) {
        if (Objects.isNull(arr)) {
            return 0;
        }
        int result = 0;
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            int end = i + 1;
            int start = length - i;
            int total = start * end;
            int odd = total / 2;
            if (total % 2 == 1) {
                odd++;
            }
            result += odd * arr[i];
        }
        return result;
    }
}
