package com.algorithm.leetcode.algorithm;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class RelativeSortArray {

    public static void main(String[] args) {
        int[] arr1 = {2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19};
        int[] arr2 = {2, 1, 4, 3, 9, 6};
//        int[] arr1 = {28, 6, 22, 8, 44, 17};
//        int[] arr2 = {22, 28, 8, 6};
        int[] result = relativeSortArray(arr1, arr2);
        System.out.println(Arrays.toString(result));
    }

    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer, Integer> map = new TreeMap<>();
        for (int n : arr1) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        int i = 0;
        for (int n : arr2) {
            int num = map.get(n);
            while (num > 0) {
                arr1[i++] = n;
                num--;
            }
            map.remove(n);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int num = entry.getValue();
            while (num > 0) {
                arr1[i++] = entry.getKey();
                num--;
            }
        }
        return arr1;
    }
}
