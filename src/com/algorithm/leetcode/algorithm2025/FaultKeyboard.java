package com.algorithm.leetcode.algorithm2025;

public class FaultKeyboard {

    public static void main(String[] args) {
        String s = "string";
//        String s = "poiinter";
        System.out.println(finalString(s));
    }

    public static String finalString(String s) {
        StringBuilder current = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'i') {
                current.reverse();
            } else {
                current.append(c);
            }
        }

        return current.toString();
    }
}
