package com.algorithm.leetcode.algorithm;

public class DivideTwoIntegers {

    public static void main(String[] args) {
        int divided = 10;
        int divisor = 3;
//        int divided = 7;
//        int divisor = -3;
        int result = divide(divided, divisor);
        System.out.println(result);
    }

    public static int divide(int dividend, int divisor) {
        if (!isValidDivisor(divisor)) {
            return 0;
        }
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        if (dividend == Integer.MIN_VALUE && divisor == 1) {
            return Integer.MIN_VALUE;
        }

        int sign = (dividend > 0 && divisor > 0 ) || (dividend < 0 && divisor < 0) ? 1 : -1;
        int quotient = 0;

        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);

        while (dividend - divisor >= 0) {
            int count = 0;
            int prev = divisor;
            int current = divisor + divisor;
            while (dividend - current >= 0) {
                count++;
                prev += prev;
                current += current;
            }

            int currentQuotient = (int) Math.pow(2, count);
            quotient += currentQuotient;
            dividend -= prev;
        }
        return quotient * sign;
    }

    public static boolean isValidDivisor(int divisor) {
        return divisor != 0;
    }
}
