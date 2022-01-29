package com.algorithm.leetcode.algorithm;

public class MyAtoi {

    public static void main(String[] args) {
        String s = "42";
//        String s = "   -42";
//        String s = "4193 with words";
//        String s = "words and 987";
        int result = myAtoi(s);
        System.out.println(result);
    }

    public static int myAtoi(String s) {
        if (!isValidString(s)) {
            return 0;
        }
        s = s.trim();
        if (s.length() == 0) {
            return 0;
        }

        char[] chars = s.toCharArray();
        int sign = 1;
        int i = 0;
        long result = 0L;
        if (chars[0] == '-') {
            sign = -1;
            i++;
        } else if (chars[0] == '+') {
            i++;
        }

        for (int j = i; j < chars.length; j++) {
            if (!Character.isDigit(chars[j])) {
                break;
            }
            result = result * 10 + (chars[j] - '0');
            if (result > Integer.MAX_VALUE) {
                if (sign == 1) {
                    return Integer.MAX_VALUE;
                } else {
                    return Integer.MIN_VALUE;
                }
            }
        }
        return (int) (sign == 1 ? result : result * -1);
    }

    public static boolean isValidString(String s) {
        return s.length() <= 200;
    }
}
