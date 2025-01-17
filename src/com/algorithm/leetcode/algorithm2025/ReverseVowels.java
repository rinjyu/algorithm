package com.algorithm.leetcode.algorithm2025;

public class ReverseVowels {

    public static void main(String[] args) {
        String s = "IceCreAm";
        //String s = "leetcode";
        System.out.println(reverseVowels(s));
    }

    public static String reverseVowels(String s) {

        String[] strs = s.split("");
        String vowels = "aeiouAEIOU";
        int left = 0;
        int right = strs.length - 1;
        while (left < right) {
            while (left < right && !vowels.contains(strs[left])) {
                left++;
            }
            while (left < right && !vowels.contains(strs[right])) {
                right--;
            }
            if (left < right) {
                String current = strs[left];
                strs[left] = strs[right];
                strs[right] = current;
                left++;
                right--;
            }
        }
        return String.join("", strs);
    }
}
