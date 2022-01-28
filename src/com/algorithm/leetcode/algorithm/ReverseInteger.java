package com.algorithm.leetcode.algorithm;

public class ReverseInteger {

    public static void main(String[] args) {
        int x = 123;
//        int x = -123;
//        int x = 120;
        int result = reverse(x);
        System.out.println(result);
    }

    public static int reverse(int x) {
        try {
            int abs = Math.abs(x);
            String reverse = new StringBuilder().append(abs).reverse().toString();
            int result = Integer.parseInt(reverse);
            return x < 0 ? result * -1 : result;
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}
