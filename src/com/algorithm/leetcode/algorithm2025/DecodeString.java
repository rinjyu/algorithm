package com.algorithm.leetcode.algorithm2025;

import java.util.Stack;

public class DecodeString {

    public static void main(String[] args) {

//        String s = "3[a]2[bc]";
//        String s = "3[a2[c]]";
        String s = "2[abc]3[cd]ef";
        System.out.println(decodeString(s));
    }

    public static String decodeString(String s) {

        Stack<Integer> repeatStack = new Stack<>();
        Stack<StringBuilder> prevStack = new Stack<>();
        StringBuilder currentString = new StringBuilder();
        int num = 0;
        for (char c : s.toCharArray()) {
            if (c == '[') {
                repeatStack.push(num);
                prevStack.push(currentString);
                currentString = new StringBuilder();
                num = 0;
            } else if (c == ']') {
                int repeat = repeatStack.pop();
                StringBuilder decodeString = prevStack.pop();
                for (int i = 0; i < repeat; i++) {
                    decodeString.append(currentString);
                }
                currentString = decodeString;
            } else if (Character.isDigit(c)) {
                num = num * 10 + (c - '0');
            } else {
                currentString.append(c);
            }
        }

        return currentString.toString();
    }
}
