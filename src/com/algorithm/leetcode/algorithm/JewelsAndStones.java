package com.algorithm.leetcode.algorithm;

public class JewelsAndStones {

    public static void main(String[] args) {
        String jewels = "aA";
        String stones = "aAAbbbb";
//        String jewels = "z";
//        String stones = "ZZ";
        int result = numJewelsInStones(jewels, stones);
        System.out.println(result);
    }

    public static int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        for (Character j : jewels.toCharArray()) {
            for (Character c : stones.toCharArray()) {
                if (j == c) {
                    count++;
                }
            }
        }
        return count;
    }
}
