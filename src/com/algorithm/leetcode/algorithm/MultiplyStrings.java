package com.algorithm.leetcode.algorithm;

public class MultiplyStrings {

    public static void main(String[] args) {
        String num1 = "2";
        String num2 = "3";
//        String num1 = "123";
//        String num2 = "456";
        String result = multiply(num1, num2);
        System.out.println(result);
    }

    public static String multiply(String num1, String num2) {
        if (!isValidArray(num1)) {
            return "";
        }
        if (!isValidArray(num2)) {
            return "";
        }
        String result = "0";
        int[] arraySum = new int[num1.length() + num2.length()];
        for (int i = num1.length() - 1; i >= 0; i--) {
            for (int j = num2.length() - 1; j >= 0; j--) {
                int multiply = Character.getNumericValue(num1.charAt(i)) * Character.getNumericValue(num2.charAt(j));
                int sum = arraySum[i + j + 1] + multiply;
                arraySum[i + j] += sum / 10;
                arraySum[i + j + 1] = sum % 10;
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int num : arraySum) {
            if (stringBuilder.length() > 0 || num != 0) {
                stringBuilder.append(num);
            }
        }
        if (stringBuilder.length() > 0) {
            result = stringBuilder.toString();
        }
        return result;
    }

    private static boolean isValidArray(String num) {
        return !num.isBlank() && num.length() >= 1 && num.length() <= 200;
    }
}