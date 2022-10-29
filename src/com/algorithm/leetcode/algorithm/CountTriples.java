package com.algorithm.leetcode.algorithm;

public class CountTriples {

    public static void main(String[] args) {
        int n = 5;
//        int n = 10;
        int result = countTriples(n);
        System.out.println(result);
    }

    public static int countTriples(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = i + 1; j <= n; j++) {
                int a = i * i + j * j;
                int l = (int) Math.sqrt(a);
                if (((l * l) == a) && (l <= n)) {
                    count += 2;
                }
            }
        }
        return count;
    }
}
