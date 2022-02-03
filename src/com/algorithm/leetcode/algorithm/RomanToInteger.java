package com.algorithm.leetcode.algorithm;

public class RomanToInteger {

    public static void main(String[] args) {
        String s = "III";
//        String s = "LVIII";
//        String s = "MCMXCIV";
//        String s = "C";
//        String s = "IV";
        int result = romanToInt(s);
        System.out.println(result);
    }

    public static int romanToInt(String s) {
        int sum = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            int current = convertNumber(s.charAt(i));
            int next = convertNumber(s.charAt(i + 1));
            if (current < next) {
                sum -= current;
            } else {
                sum += current;
            }
        }
        int last = convertNumber(s.charAt(s.length() - 1));
        return sum + last;
    }

    public static int convertNumber(char symbol) {
        int result = 0;
        switch (symbol) {
            case 'I':
                result = 1;
                break;
            case 'V':
                result = 5;
                break;
            case 'X':
                result = 10;
                break;
            case 'L':
                result = 50;
                break;
            case 'C':
                result = 100;
                break;
            case 'D':
                result = 500;
                break;
            case 'M':
                result = 1000;
                break;
        }
        return result;
    }
}