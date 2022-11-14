package com.algorithm.leetcode.algorithm;

public class DigitSum {

    public static void main(String[] args) {
        String s = "11111222223";
        int k = 3;
//        String s = "00000000";
//        int k = 3;
        String result = digitSum(s, k);
        System.out.println(result);
    }

    public static String digitSum(String s, int k) {
        while (s.length() > k) {
            StringBuilder text = new StringBuilder();
            for (int i = 0; i < s.length(); i += k) {
                int sum = 0;
                String temp = s.substring(i, Math.min(i + k, s.length()));
                for (int j = 0; j < temp.length(); j++) {
                    sum += temp.charAt(j) - '0';
                }
                text.append(sum);
            }
            s = text.toString();
        }
        return s;
    }
}
