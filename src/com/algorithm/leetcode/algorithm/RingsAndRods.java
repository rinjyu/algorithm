package com.algorithm.leetcode.algorithm;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class RingsAndRods {

    public static void main(String[] args) {
        String rings = "B0B6G0R6R0R6G9";
//        String rings = "B0R0G0R9R0B0G0";
//        String rings = "G4";
        int result = countPoints(rings);
        System.out.println(result);
    }

    public static int countPoints(String rings) {
        Map<Integer, Set<Character>> map = new HashMap<>();
        int count = 0;
        for (int i = 1; i < rings.length(); i += 2) {
            int n = rings.charAt(i) - '0';
            char c = rings.charAt(i - 1);
            Set<Character> set;
            if (map.containsKey(n)) {
                set = map.get(n);
            } else {
                set = new HashSet<>();
            }
            set.add(c);
            map.put(n, set);
        }

        for (Set<Character> set : map.values()) {
            if (set.size() == 3) {
                count++;
            }
        }
        return count;
    }
}
