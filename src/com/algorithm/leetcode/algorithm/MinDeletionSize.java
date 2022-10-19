package com.algorithm.leetcode.algorithm;

public class MinDeletionSize {

    public static void main(String[] args) {
        String[] strs = {"cba", "daf", "ghi"};
//        String[] strs = {"a", "b"};
//        String[] strs = {"zyx", "wvu", "tsr"};
        int result = minDeletionSize(strs);
        System.out.println(result);
    }

    public static int minDeletionSize(String[] strs) {
        int count = 0;
        for (int i = 0; i < strs[0].length(); i++) {
            for (int j = 0; j < strs.length - 1; j++) {
                if (strs[j + 1].charAt(i) < strs[j].charAt(i)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}
