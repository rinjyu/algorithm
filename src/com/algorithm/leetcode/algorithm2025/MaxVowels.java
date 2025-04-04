package com.algorithm.leetcode.algorithm2025;

import java.util.HashSet;
import java.util.Set;

public class MaxVowels {

    public static void main(String[] args) {

        String s = "abciiidef";
        int k = 3;
//        String s = "aeiou";
//        int k = 2;
//        String s = "leetcode";
//        int k = 3;
        System.out.println(maxVowels(s, k));
    }

    public static int maxVowels(String s, int k) {

        Set<Character> set = new HashSet<>();
        char[] chars = {'a', 'e', 'i', 'o', 'u'};
        for (int i = 0; i < chars.length; i++) {
            set.add(chars[i]);
        }

        int count = 0;
        int max = 0;
        for (int i = 0; i < k; i++) {
            if (set.contains(s.charAt(i))) {
                count++;
            }
        }
        max = count;

        for (int i = k; i < s.length(); i++) {
            if (set.contains(s.charAt(i - k))) {
                count--;
            }
            if (set.contains(s.charAt(i))) {
                count++;
            }
            max = Math.max(max, count);
        }

        return max;
    }
}
