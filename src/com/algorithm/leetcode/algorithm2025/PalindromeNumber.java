package com.algorithm.leetcode.algorithm2025;

public class PalindromeNumber {

    public static void main(String[] args) {
        int x = 121;
//        int x = -121;
//        int x = 10;
        System.out.println(isPalindrome(x));
    }

    public static boolean isPalindrome(int x) {

        String s = String.valueOf(x);
        String[] array = s.split("");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = array.length - 1; i >= 0; i--) {
            stringBuilder.append(array[i]);
        }

        return s.equals(stringBuilder.toString());
    }
}
