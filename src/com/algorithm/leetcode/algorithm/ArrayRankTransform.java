package com.algorithm.leetcode.algorithm;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ArrayRankTransform {

    public static void main(String[] args) {
        int[] arr = {40, 10, 20, 30};
//        int[] arr = {100, 100, 100};
//        int[] arr = {37, 12, 28, 9, 100, 56, 80, 5, 12};
        int[] result = arrayRankTransform(arr);
        System.out.println(Arrays.toString(result));
    }

    public static int[] arrayRankTransform(int[] arr) {
        int[] array = Arrays.copyOf(arr, arr.length);
        Arrays.sort(array);
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : array) {
            map.putIfAbsent(n, map.size() + 1);
        }
        for (int i = 0; i < arr.length; i++) {
            array[i] = map.get(arr[i]);
        }
        return array;
    }
}
