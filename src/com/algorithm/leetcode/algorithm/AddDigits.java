package com.algorithm.leetcode.algorithm;

public class AddDigits {

    public static void main(String[] args) {
        int num = 38;
//        int num = 0;
        int result = addDigits(num);
        System.out.println(result);
    }

    public static int addDigits(int num) {
        int i = 0;
        while (num > 0) {
            i += num % 10;
            num /= 10;
            if (num == 0 && i > 9) {
                num = i;
                i = 0;
            }
        }
        return i;
    }
}
