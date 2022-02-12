package com.algorithm.leetcode.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenerateParenthesis {

    public static void main(String[] args) {
        int n = 3;
        List<String> result = generateParenthesis(n);
        System.out.println(Arrays.toString(result.toArray()));
    }

    public static List<String> generateParenthesis(int n) {
        if (!isValidNumber(n)) {
            return new ArrayList<>();
        }

        List<String> list = new ArrayList<>();
        addParenthesis(list, new StringBuilder(), 0, 0, n);
        return list;
    }

    public static void addParenthesis(List<String> list, StringBuilder current, int open, int close, int max) {
        if (current.length() == max * 2) {
            list.add(current.toString());
            return;
        }
        if (open < max) {
            current.append("(");
            addParenthesis(list, current, open + 1, close, max);
            current.deleteCharAt(current.length() - 1);
        }
        if (close < open) {
            current.append(")");
            addParenthesis(list, current, open, close + 1, max);
            current.deleteCharAt(current.length() - 1);
        }
    }

    public static boolean isValidNumber(int n) {
        return n >= 1 && n <= 8;
    }
}
