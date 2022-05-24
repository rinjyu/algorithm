package com.algorithm.leetcode.algorithm;

public class ExcelSheetColumnNumber {

    public static void main(String[] args) {
        String columnTitle = "A";
//        String columnTitle = "AB";
//        String columnTitle = "ZY";
        int result = titleNumber(columnTitle);
        System.out.println(result);
    }

    public static int titleNumber(String columnTitle) {
        if (!isValidLength(columnTitle)) {
            return 0;
        }
        int length = columnTitle.length();
        int result = columnTitle.charAt(length - 1) - 64;
        if (length == 1) {
            return result;
        }
        for (int i = 0; i < length - 1; i++) {
            int j = columnTitle.charAt(i) - 64;
            result += Math.pow(26, (length - i - 1)) * j;
        }
        return result;
    }

    private static boolean isValidLength(String columnTitle) {
        return !columnTitle.isBlank() && columnTitle.length() <= 7;
    }
}
