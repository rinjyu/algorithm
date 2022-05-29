package com.algorithm.leetcode.algorithm;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {

    public static void main(String[] args) {
        String ransomNode = "a";
        String magazine = "b";
//        String ransomNode = "aa";
//        String magazine = "ab";
//        String ransomNode = "aa";
//        String magazine = "aab";
        boolean result = canConstruct(ransomNode, magazine);
        System.out.println(result);
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        if (!isValidString(ransomNote)) {
            return false;
        }
        if (!isValidString(magazine)) {
            return false;
        }
        Map<Character, Integer> map = new HashMap();
        for (char c : magazine.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (char c : ransomNote.toCharArray()) {
            int count = map.containsKey(c) ? map.get(c) - 1 : -1;
            if (count == -1) {
                return false;
            }
            map.put(c, count);
        }
        return true;
    }
    
    private static boolean isValidString(String s) {
        return !s.isBlank();
    }
}
