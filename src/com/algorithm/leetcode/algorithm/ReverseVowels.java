package com.algorithm.leetcode.algorithm;

public class ReverseVowels {

    public static void main(String[] args) {
        String s = "hello";
        String result = reverseVowels(s);
        System.out.println(result);
    }

    public static String reverseVowels(String s) {
        char[] ch = s.toCharArray();
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (!isVowels(ch[i])) {
                i++;
                continue;
            }
            if (!isVowels(ch[j])) {
                j--;
                continue;
            }
            ch = changeChar(ch, i, j);
            i++;
            j--;
        }
        return String.valueOf(ch);
    }

    private static boolean isVowels(char ch) {
        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                return true;
            default:
                return false;
        }
    }

    private static char[] changeChar(char[] ch, int i, int j) {
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
        return ch;
    }
}
