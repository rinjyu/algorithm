package com.algorithm.leetcode.algorithm;

public class DecodeWays {

    public static void main(String[] args) {
        String s = "12";
//        String s = "226";
//        String s = "06";
        int result = numDecodings(s);
        System.out.println(result);
    }

    public static int numDecodings(String s) {
        if (!isValidString(s)) {
            return 0;
        }
        if (s.length() == 1 && s.charAt(0) == '0') {
            return 0;
        }
        if (s.length() == 1 && s.charAt(0) != '0') {
            return 1;
        }
        int[] result = new int[s.length() + 1];
        result[0] = 1;
        result[1] = s.charAt(0) != '0' ? 1 : 0;
        for (int i = 2; i <= s.length(); i++) {
            int firstNumber = Integer.parseInt(s.substring(i - 1, i));
            int secondNumber = Integer.parseInt(s.substring(i - 2, i));
            if (firstNumber >= 1 && firstNumber <= 9) {
                result[i] = result[i - 1] + result[i];
            }
            if (secondNumber >= 10 && secondNumber <= 26) {
                result[i] = result[i - 2] + result[i];
            }
        }
        return result[s.length()];
    }

    private static boolean isValidString(String s) {
        return !s.isBlank() && s.length() >= 1 && s.length() <= 100;
    }
}
