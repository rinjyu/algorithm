package com.algorithm.leetcode.algorithm;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Stack;

public class RemoveDuplicateLetters {

    public static void main(String[] args) {
        String s = "bcabc";
//        String s = "cbacdcbc";
        String result = removeDuplicateLetters(s);
        System.out.println(result);
    }

    public static String removeDuplicateLetters(String s) {
        if (!isValidLength(s)) {
            return "";
        }
        int[] array = new int[26];
        Map<Character, Integer> map = new HashMap<>();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), i);
        }
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if (array[current - 'a'] == 1) {
                continue;
            }
            while (!stack.isEmpty() && (current < stack.peek()) && (i < map.get(stack.peek()))) {
                array[stack.pop() - 'a'] = 0;
            }
            stack.push(current);
            array[current - 'a'] = 1;
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }

    private static boolean isValidLength(String s) {
        return !Objects.isNull(s) && s.length() >= 1 && s.length() <= 10_000;
    }
}