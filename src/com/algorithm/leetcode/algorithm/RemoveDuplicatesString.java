package com.algorithm.leetcode.algorithm;

import java.util.Stack;

public class RemoveDuplicatesString {

    public static void main(String[] args) {
        String s = "abbaca";
//        String s = "azxxzy";
        String result = removeDuplicates(s);
        System.out.println(result);
    }

    public static String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (!stack.empty()) {
                if (stack.peek().equals(c)) {
                    stack.pop();
                } else {
                    stack.push(c);
                }
            } else {
                stack.push(c);
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        while (!stack.empty()) {
            stringBuilder.append(stack.pop());
        }
        return stringBuilder.reverse().toString();
    }
}
