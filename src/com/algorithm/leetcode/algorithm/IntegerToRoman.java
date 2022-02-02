package com.algorithm.leetcode.algorithm;

import java.util.HashMap;
import java.util.Map;

public class IntegerToRoman {

    public static void main(String[] args) {
        int num = 3;
//        int num = 58;
//        int num = 1994;
//        int num = 100;
        String result = intToRoman(num);
        System.out.println(result);
    }

    public static String intToRoman(int num) {
        if (!isValidNumber(num)) {
            return "";
        }
        StringBuilder roman = new StringBuilder();
        while (num > 0) {
            if (num - 1000 >= 0) {
                roman.append(convertSymbol(1000));
                num -= 1000;
            } else if (num - 900 >= 0) {
                roman.append(convertSymbol(900));
                num -= 900;
            } else if (num - 500 >= 0) {
                roman.append(convertSymbol(500));
                num -= 500;
            } else if (num - 400 >= 0) {
                roman.append(convertSymbol(400));
                num -= 400;
            } else if (num - 100 >= 0) {
                roman.append(convertSymbol(100));
                num -= 100;
            } else if (num - 90 >= 0) {
                roman.append(convertSymbol(90));
                num -= 90;
            } else if (num - 50 >= 0) {
                roman.append(convertSymbol(50));
                num -= 50;
            } else if (num - 40 >= 0) {
                roman.append(convertSymbol(40));
                num -= 40;
            } else if (num - 10 >= 0) {
                roman.append(convertSymbol(10));
                num -= 10;
            } else if (num - 9 >= 0) {
                roman.append(convertSymbol(9));
                num -= 9;
            } else if (num - 5 >= 0) {
                roman.append(convertSymbol(5));
                num -= 5;
            } else if (num - 4 >= 0) {
                roman.append(convertSymbol(4));
                num -= 4;
            } else {
                roman.append(convertSymbol(1));
                num -= 1;
            }
        }
        return roman.toString();
    }

    public static String convertSymbol(int number) {
        Map<Integer, String> symbols = new HashMap<>();
        symbols.put(0, "");
        symbols.put(1, "I");
        symbols.put(4, "IV");
        symbols.put(5, "V");
        symbols.put(9, "IX");
        symbols.put(10, "X");
        symbols.put(40, "XL");
        symbols.put(50, "L");
        symbols.put(90, "XC");
        symbols.put(100, "C");
        symbols.put(400, "CD");
        symbols.put(500,"D");
        symbols.put(900, "CM");
        symbols.put(1000, "M");
        return symbols.get(number);
    }

    public static boolean isValidNumber(int number) {
        return number >= 1 && number <= 3999;
    }
}
