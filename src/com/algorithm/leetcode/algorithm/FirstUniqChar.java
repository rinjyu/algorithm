package com.algorithm.leetcode.algorithm;

public class FirstUniqChar {

    public static void main(String[] args) {
        String s = "leetcode";
//        String s = "loveleetcode";
//        String s = "aabb";
        int result = firstUniqChar(s);
        System.out.println(result);
    }

    public static int firstUniqChar(String s) {
        int length = s.length();
        int i = -1;
        int j = 0;
        while (j < length) {
            char c = s.charAt(j);
            int first = s.indexOf(c);
            int last = s.lastIndexOf(c);
            if (first == last) {
                i = j;
                break;
            }
            j++;
        }
        return i;
    }
}
