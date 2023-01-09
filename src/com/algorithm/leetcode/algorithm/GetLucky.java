package com.algorithm.leetcode.algorithm;

public class GetLucky {

    public static void main(String[] args) {
        String s = "iiii";
        int k = 1;
//        String s = "leetcode";
//        int k  = 2;
//        String s = "zbax";
//        int k = 2;
        int result = getLucky(s, k);
        System.out.println(result);
    }

    public static int getLucky(String s, int k) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            stringBuilder.append(Integer.toString(s.charAt(i) - 'a' + 1));
        }
        int result = 0;
        while (k != 0) {
            result = 0;
            for (int i = 0; i < stringBuilder.length(); i++) {
                result += stringBuilder.charAt(i) - '0';
            }
            stringBuilder.delete(0, stringBuilder.length());
            stringBuilder.append(Integer.toString(result));
            k--;
        }
        return result;
    }
}
