package com.algorithm.leetcode.algorithm;

import java.util.Stack;

public class ValidParentheses {

    public static void main(String[] args) {
        String s = "()";
//        String s = "()[]{}";
//        String s = "(]";
        boolean result = isValid(s);
        System.out.println(result);
    }

    public static boolean isValid(String s) {
        if (!isValidText(s)) {
            return false;
        }

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (stack.empty()) {
                return false;
            } else if (c != getPairCharacter(stack.pop())) {
                return false;
            }
        }
        return stack.empty();
    }

    public static boolean isValidText(String s) {
        if (!s.isBlank() && s.length() <= 10000) {
            return s.length() % 2 == 0;
        }
        return false;
    }

    public static Character getPairCharacter(char c) {
        char result;
        switch (c) {
            case '(':
                result = ')';
                break;
            case '{':
                result = '}';
                break;
            case '[':
                result = ']';
                break;
            default:
                result = 'X';
                break;
        }
        return result;
    }
}