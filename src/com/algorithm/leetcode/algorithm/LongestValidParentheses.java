package com.algorithm.leetcode.algorithm;

import java.util.Stack;

public class LongestValidParentheses {

    public static void main(String[] args) {
        String s = "(()";
//        String s = ")()())";
//        String s = "";
//        String s = "()(())";
        int result = longestValidParentheses(s);
        System.out.println(result);
    }

    public static int longestValidParentheses(String s) {
        if (!isValidText(s)) {
            return 0;
        }
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else {
                if (stack.isEmpty()) {
                    stack.push(i);
                } else if (s.charAt(stack.peek()) == '(') {
                    stack.pop();
                } else {
                    stack.push(i);
                }
            }
        }
        return maxCount(stack, s);
    }

    private static boolean isValidText(String s) {
        return !s.isBlank() && s.length() <= 30000;
    }

    private static int maxCount(Stack<Integer> stack, String s) {
        int max = 0;
        if (stack.isEmpty()) {
            return s.length();
        }
        int end = s.length();
        while (!stack.isEmpty()) {
            int current = stack.pop();
            max = Math.max(max, end - current - 1);
            end = current;
        }
        return Math.max(max, end);
    }
}
