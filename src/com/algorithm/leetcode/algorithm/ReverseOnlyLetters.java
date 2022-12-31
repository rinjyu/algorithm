package com.algorithm.leetcode.algorithm;

public class ReverseOnlyLetters {

    public static void main(String[] args) {
        String s = "ab-cd";
//        String s = "a-bC-dEf-ghIj";
//        String s = "Test1ng-Leet=code-Q!";
        String result = reverseOnlyLetters(s);
        System.out.println(result);
    }

    public static String reverseOnlyLetters(String s) {
        int left = 0;
        int right = s.length() - 1;
        char[] chars = s.toCharArray();
        while (left < right) {
            if (Character.isLetter(chars[left]) && Character.isLetter(chars[right])) {
                swap(chars, left, right);
                left++;
                right--;
            }
            if (!Character.isLetter(chars[left])) {
                left++;
            }
            if (!Character.isLetter(chars[right]))
                right--;
        }
        return new String(chars);
    }

    private static void swap(char[] chars, int left, int right) {
        char temp = chars[left];
        chars[left] = chars[right];
        chars[right] = temp;
    }
}
