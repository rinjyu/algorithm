package com.algorithm.leetcode.algorithm;

public class ToHex {

    public static void main(String[] args) {
        int num = 26;
//        int num = -1;
        String result = toHex(num);
        System.out.println(result);
    }

    public static String toHex(int num) {
        if (num == 0) {
            return "0";
        }

        char[] chars = {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
        String result = "";
        while (num != 0) {
            result = chars[(num & 15)] + result;
            num = (num >>> 4);
        }
        return result;
    }
}
