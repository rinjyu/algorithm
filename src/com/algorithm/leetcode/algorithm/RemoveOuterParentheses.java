package com.algorithm.leetcode.algorithm;

import java.util.Stack;

public class RemoveOuterParentheses {

    public static void main(String[] args) {
        String s = "(()())(())";
//        String s = "(()())(())(()(()))";
//        String s = "()()";
        String result = removeOuterParentheses(s);
        System.out.println(result);
    }

    public static String removeOuterParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (stack.isEmpty() && c == '(') {
                stack.push(c);
                continue;
            }
            if (stack.size() == 1 && c == ')') {
                stack.pop();
                continue;
            }
            if (c == '(') {
                stack.push(c);
            }
            if (c == ')') {
                stack.pop();
            }
            stringBuilder.append(c);
        }
        return stringBuilder.toString();
    }
}
