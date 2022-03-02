package com.algorithm.leetcode.algorithm;

public class CountAndSay {

    public static void main(String[] args) {
//        int n = 1;
        int n = 4;
        String result = countAndSay(n);
        System.out.println(result);
    }

    public static String countAndSay(int n) {
        if (!isValidNumber(n)) {
            return "";
        }
        if (n == 1) {
            return "1";
        }
        String s = countAndSay(n - 1);
        int count = 1;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                count++;
            } else {
                stringBuilder.append(count);
                stringBuilder.append(s.charAt(i));
                count = 1;
            }
        }
        stringBuilder.append(count);
        stringBuilder.append(s.charAt(s.length() - 1));
        return stringBuilder.toString();
    }

    private static boolean isValidNumber(int n) {
        return n >= 1 && n <= 30;
    }
}
