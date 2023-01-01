package com.algorithm.leetcode.algorithm;

public class Reformat {

    public static void main(String[] args) {
        String s = "a0b1c2";
//        String s = "leetcode";
//        String s = "1229857369";
        String result = reformat(s);
        System.out.println(result);
    }

    public static String reformat(String s) {
        int number = 0;
        int letter = 0;
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                number++;
            } else {
                letter++;
            }
        }
        if (Math.abs(letter - number) > 1) {
            return "";
        }
        return letter > number ? resultFormat(s, 0, 1) : resultFormat(s, 1, 0);
    }

    private static String resultFormat(String s, int i, int j) {
        char[] c = s.toCharArray();
        char[] result = new char[s.length()];
        for (char ch : c) {
            if (Character.isLetter(ch)) {
                result[i] = ch;
                i += 2;
            } else {
                result[j] = ch;
                j += 2;
            }
        }
        return String.valueOf(result);
    }
}
