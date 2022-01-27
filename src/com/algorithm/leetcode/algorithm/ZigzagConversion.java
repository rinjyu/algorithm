package com.algorithm.leetcode.algorithm;

public class ZigzagConversion {

    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        int numRows = 3;
//        int numRows = 4;
        String result = convert(s, numRows);
        System.out.println(result);
    }

    public static String convert(String s, int numRows) {
        if (!isValidString(s) || !isValidRows(numRows)) {
            return "";
        }

        if (numRows == 1) {
            return s;
        }

        StringBuilder stringBuilder = new StringBuilder();
        int length = s.length();
        int distance = 2 * numRows - 2;
        for (int i = 0; i  < numRows; i++) {
            for (int j = 0; j + i < length; j += distance) {
                stringBuilder.append(s.charAt(j + i));
                if (i != 0 && i != numRows - 1 && j + distance - i < length) {
                    stringBuilder.append(s.charAt(j + distance - i));
                }
            }
        }
        return stringBuilder.toString();
    }

    public static boolean isValidString(String s) {
        return s.length() >= 1 && s.length() <= 1000;
    }

    public static boolean isValidRows(int rows) {
        return rows >= 1 && rows <= 1000;
    }
}
