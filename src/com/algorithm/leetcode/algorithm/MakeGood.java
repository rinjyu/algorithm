package com.algorithm.leetcode.algorithm;

import java.util.Stack;

public class MakeGood {

    public static void main(String[] args) {
        String s = "leEeetcode";
//        String s = "abBAcC";
        String result = makeGood(s);
        System.out.println(result);
    }

    public static String makeGood(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() && Math.abs(stack.peek() - c) == 32) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        while (!stack.isEmpty()) {
            stringBuilder.append(stack.pop());
        }
        return stringBuilder.reverse().toString();
    }
}
