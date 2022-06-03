package com.algorithm.leetcode.algorithm;

public class AddStrings {

    public static void main(String[] args) {
        String num1 = "11";
        String num2 = "123";
//        String num1 = "456";
//        String num2 = "77";
//        String num1 = "0";
//        String num2 = "0";
        String result = addStrings(num1, num2);
        System.out.println(result);
    }

    public static String addStrings(String num1, String num2) {
        StringBuilder stringBuilder = new StringBuilder();
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;
        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;
            if (i >= 0) {
                sum += num1.charAt(i) - '0';
            }
            if (j >= 0) {
                sum += num2.charAt(j) - '0';
            }
            stringBuilder.append(sum % 10);
            carry = sum / 10;
            i--;
            j--;
        }
        return stringBuilder.reverse().toString();
    }
}
