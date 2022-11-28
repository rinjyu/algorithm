package com.algorithm.leetcode.algorithm;

public class ReformatNumber {

    public static void main(String[] args) {
        String number = "1-23-45 6";
//        String number = "123 4-567";
//        String number = "123 4-5678";
        String result = reformatNumber(number);
        System.out.println(result);
    }

    public static String reformatNumber(String number) {
        number = number.replaceAll(" ", "").replaceAll("-", "");
        int length = number.length();
        if (length <= 3) {
            return number;
        } else if (length == 4) {
            return number.substring(0, 2) + "-" + number.substring(2, 4);
        } else {
            number = number.substring(0, 3) + "-" + reformatNumber(number.substring(3, length));
        }
        return number;
    }
}
