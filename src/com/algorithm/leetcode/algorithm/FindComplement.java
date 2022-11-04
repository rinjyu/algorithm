package com.algorithm.leetcode.algorithm;

public class FindComplement {

    public static void main(String[] args) {
        int num = 5;
//        int num = 1;
        int result = findComplement(num);
        System.out.println(result);
    }

    public static int findComplement(int num) {
        int i = 0;
        int j = 0;
        while (i < num) {
            i += Math.pow(2, j);
            j++;
        }
        return i - num;
    }
}
