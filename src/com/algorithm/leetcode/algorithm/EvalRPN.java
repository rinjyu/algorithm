package com.algorithm.leetcode.algorithm;

import java.util.Stack;

public class EvalRPN {

    public static void main(String[] args) {
        String[] tokens = {"2", "1", "+", "3", "*"};
//        String[] tokens = {"4", "13", "5", "/", "+"};
//        String[] tokens = {"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};
        int result = evalRPN(tokens);
        System.out.println(result);
    }

    public static int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String s : tokens) {
            if ("+".equals(s) || "-".equals(s) || "*".equals(s) || "/".equals(s)) {
                int first = stack.pop();
                int last = stack.pop();
                if ("+".equals(s)) {
                    stack.push(first + last);
                } else if ("-".equals(s)) {
                    stack.push(last - first);
                } else if ("*".equals(s)) {
                    stack.push(first * last);
                } else {
                    stack.push(last / first);
                }
            } else {
                stack.push(Integer.parseInt(s));
            }
        }
        return stack.pop();
    }
}
