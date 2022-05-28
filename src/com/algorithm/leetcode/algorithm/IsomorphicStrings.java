package com.algorithm.leetcode.algorithm;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {

    public static void main(String[] args) {
        String s = "egg";
        String t = "add";
//        String s = "foo";
//        String t = "bar";
//        String s = "paper";
//        String t = "title";
        boolean result = isIsomorphic(s, t);
        System.out.println(result);
    }

    public static boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if (map.containsKey(sChar)) {
                if (map.get(sChar) != tChar) {
                    return false;
                }
            } else if (map.containsValue(tChar)) {
                return false;
            }
            map.put(sChar, tChar);
        }
        return true;
    }
}
