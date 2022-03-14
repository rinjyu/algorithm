package com.algorithm.leetcode.algorithm;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Objects;

public class SimplifyPath {

    public static void main(String[] args) {
        String path = "/home/";
//        String path = "/../";
//        String path = "/home//foo/";
        String result = simplifyPath(path);
        System.out.println(result);
    }

    public static String simplifyPath(String path) {
        if (!isValidPath(path)) {
            return "";
        }
        String root = "/";
        Deque<String> deque = new ArrayDeque<>();
        for (String p : path.split(root)) {
            if ((p.length() == 0) || ".".equals(p)) {
                continue;
            }
            if ("..".equals(p)) {
                if (!deque.isEmpty()) {
                    deque.removeLast();
                }
            } else {
                deque.add(p);
            }
        }

        if (deque.isEmpty()) {
            return root;
        }

        StringBuilder resultPath = new StringBuilder();
        while (!deque.isEmpty()) {
            resultPath.append(root)
                .append(deque.removeFirst());
        }
        return resultPath.toString();
    }

    private static boolean isValidPath(String path) {
        return !Objects.isNull(path) && path.length() >= 1 && path.length() <= 3000;
    }
}