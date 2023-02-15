package com.algorithm.leetcode.algorithm;

public class RearrangeCharacters {

    public static void main(String[] args) {
        String s = "ilovecodingonleetcode";
        String target = "code";
//        String s = "abcba";
//        String target = "abc";
//        String s = "abbaccaddaeea";
//        String target = "aaaaa";
        int result = rearrangeCharacters(s, target);
        System.out.println(result);
    }

    public static int rearrangeCharacters(String s, String target) {
        int[] array1 = new int[26];
        int[] array2 = new int[26];
        for (int i = 0; i < s.length(); i++) {
            array1[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < target.length(); i++) {
            array2[target.charAt(i) - 'a']++;
        }
        int result = s.length();
        for (int i = 0; i < 26; i++) {
            if (array2[i] != 0) {
                result = Math.min(result, array1[i] / array2[i]);
            }
        }
        return result;
    }
}
