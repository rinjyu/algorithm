package com.algorithm.leetcode.algorithm;

public class LargestGoodInteger {

    public static void main(String[] args) {
        String num = "6777133339";
//        String num = "2300019";
        String result = largestGoodInteger(num);
        System.out.println(result);
    }

    public static String largestGoodInteger(String num) {
        String result = "";
        for (int i = 2; i < num.length(); i++) {
            if (num.charAt(i) == num.charAt(i - 1)
                    && num.charAt(i - 1) == num.charAt(i - 2)) {
                if (num.substring(i - 2, i + 1).compareTo(result) > 0) {
                    result = num.substring(i - 2, i + 1);
                }
            }
        }
        return result;
    }
}
