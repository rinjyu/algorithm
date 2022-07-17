package com.algorithm.leetcode.algorithm;

import java.util.HashMap;
import java.util.Map;

public class DecodeMessage {

    public static void main(String[] args) {
        String key = "the quick brown fox jumps over the lazy dog";
        String message = "vkbs bs t suepuv";
//        String key = "eljuxhpwnyrdgtqkviszcfmabo";
//        String message = "zwx hnfx lqantp mnoeius ycgk vcnjrdb";
        String result = decodeMessage(key, message);
        System.out.println(result);
    }

    public static String decodeMessage(String key, String message) {
        StringBuilder result = new StringBuilder();
        String s = key.replace(" ", "");
        Map<Character, Character> map = new HashMap<>();
        char c = 'a';
        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), c++);
            }
        }
        for (int i = 0; i < message.length(); i++) {
            if (map.containsKey(message.charAt(i))) {
                result.append(map.get(message.charAt(i)));
            } else {
                result.append(message.charAt(i));
            }
        }

        return result.toString();
    }
}
