package com.algorithm.leetcode.algorithm2025;

public class StringCompression {

    public static void main(String[] args) {
//        char[] chars = {'a','a','b','b','c','c','c'};
//        char[] chars = {'a'};
        char[] chars = {'a','b','b','b','b','b','b','b','b','b','b','b','b'};
        System.out.println(compress(chars));
    }

    public static int compress(char[] chars) {

        int index = 0;
        int i = 0;
        while (i < chars.length) {
            char current = chars[i];
            int count = 0;

            while (i < chars.length && chars[i] == current) {
                count++;
                i++;
            }
            chars[index++] = current;
            if (count > 1) {
                for (char c : Integer.toString(count).toCharArray()) {
                    chars[index++] = c;
                }
            }
        }

        return index;
    }
}
