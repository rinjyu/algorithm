package com.algorithm.leetcode.algorithm;

import java.util.HashSet;
import java.util.Set;

public class PathCrossing {

    public static void main(String[] args) {
        String path = "NES";
//        String path = "NESWW";
        boolean result = isPathCrossing(path);
        System.out.println(result);
    }

    public static boolean isPathCrossing(String path) {
        Set<String> set = new HashSet<>();
        int x = 0;
        int y = 0;
        set.add(x + "," + y);
        for (char c : path.toCharArray()) {
            if (c == 'N') {
                y++;
            } else if (c == 'S') {
                y--;
            } else if (c == 'E') {
                x++;
            } else {
                x--;
            }
            if (set.contains(x + "," + y)) {
                return true;
            }
            set.add(x + "," + y);
        }
        return false;
    }
}
