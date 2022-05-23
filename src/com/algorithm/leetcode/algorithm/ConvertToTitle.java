package com.algorithm.leetcode.algorithm;

public class ConvertToTitle {

    public static void main(String[] args) {
        int columnNumber = 1;
//        int columnNumber = 28;
//        int columnNumber = 701;
        String result = convertToTitle(columnNumber);
        System.out.println(result);
    }

    public static String convertToTitle(int columnNumber) {
        StringBuilder stringBuilder = new StringBuilder();
        while (columnNumber > 0) {
            char c = (char) ('A' + (columnNumber - 1) % 26);
            stringBuilder.append(c);
            columnNumber = (columnNumber - 1) / 26;
        }
        return stringBuilder.reverse().toString();
    }
}
