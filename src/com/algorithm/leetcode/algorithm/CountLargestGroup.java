package com.algorithm.leetcode.algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CountLargestGroup {

    public static void main(String[] args) {
        int n = 13;
//        int n = 2;
        int result = countLargestGroup(n);
        System.out.println(result);
    }

    public static int countLargestGroup(int n) {
        List<Integer> list = new ArrayList<>(Collections.nCopies(37, 0));
        for (int i = 1; i <= n; i++) {
            int count = counting(i);
            list.set(count, list.get(count) + 1);
        }
        return Collections.frequency(list, Collections.max(list));
    }

    private static int counting(int n) {
        if (n == 0) {
            return 0;
        }
        return n % 10 + counting(n / 10);
    }
}
