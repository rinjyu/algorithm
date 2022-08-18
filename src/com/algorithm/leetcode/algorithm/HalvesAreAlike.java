package com.algorithm.leetcode.algorithm;

public class HalvesAreAlike {

    public static void main(String[] args) {
        String s = "book";
//        String s = "textbook";
        boolean result = halvesAreAlike(s);
        System.out.println(result);
    }

    public static boolean halvesAreAlike(String s) {
        if (s.isBlank()) {
            return false;
        }
        int halfLength = s.length() / 2;
        s = s.toLowerCase();
        String a = s.substring(0, halfLength);
        String b = s.substring(halfLength);
        int count = 0;
        for (int i = 0; i < halfLength; i++) {
            char c1 = a.charAt(i);
            char c2 = b.charAt(i);
            if (c1 == 'a' || c1 == 'e' || c1 == 'i' || c1 == 'o' || c1 == 'u') {
                count++;
            }
            if (c2 == 'a' || c2 == 'e' || c2 == 'i' || c2 == 'o' || c2 == 'u') {
                count--;
            }
        }
        return count == 0;
    }
}
