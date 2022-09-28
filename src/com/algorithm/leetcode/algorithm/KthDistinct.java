package com.algorithm.leetcode.algorithm;

import java.util.HashMap;
import java.util.Map;

public class KthDistinct {

    public static void main(String[] args) {
        String[] arr = {"d", "b", "c", "b", "c", "a"};
        int k = 2;
//        String[] arr = {"aaa", "aa", "a"};
//        int k = 1;
//        String[] arr = {"a", "b", "a"};
//        int k = 3;
        String result = kthDistinct(arr, k);
        System.out.println(result);
    }

    public static String kthDistinct(String[] arr, int k) {
        Map<String, Integer> map = new HashMap<>();
        for (String s : arr) {
            if (map.containsKey(s)) {
                map.put(s, map.get(s) + 1);
            } else {
                map.put(s, 1);
            }
        }
        int i = 0;
        for (String s : arr) {
            if (map.get(s) == 1) {
                i++;
                if (i == k) {
                    return s;
                }
            }
        }
        return "";
    }
}
