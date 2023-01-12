package com.algorithm.leetcode.algorithm;

import java.util.HashMap;
import java.util.Map;

public class BestHand {

    public static void main(String[] args) {
        int[] ranks = {13, 2, 3, 1, 9};
        char[] suits = {'a', 'a', 'a', 'a', 'a'};
//        int[] ranks = {4, 4, 2, 4, 4};
//        char[] suits = {'d', 'a', 'a', 'b', 'c'};
//        int[] ranks = {10, 10, 2, 12, 9};
//        char[] suits = {'a', 'b', 'c', 'a', 'd'};
        String result = bestHand(ranks, suits);
        System.out.println(result);
    }

    public static String bestHand(int[] ranks, char[] suits) {
        Map<Integer, Integer> rankMap = new HashMap<>();
        for (int rank : ranks) {
            rankMap.put(rank, rankMap.getOrDefault(rank, 0) + 1);
        }
        Map<Character, Integer> suitMap = new HashMap<>();
        for (char suit : suits) {
            suitMap.put(suit, suitMap.getOrDefault(suit, 0) + 1);
        }
        for (int i : suitMap.values()) {
            if (i == 5) {
                return "Flush";
            }
        }
        for (int i : rankMap.values()) {
            if (i >= 3) {
                return "Three of a Kind";
            }
        }
        for (int i : rankMap.values()) {
            if (i == 2) {
                return "Pair";
            }
        }
        for (int i : rankMap.values()) {
            if (i == 1) {
                return "High Card";
            }
        }
        return "";
    }
}
