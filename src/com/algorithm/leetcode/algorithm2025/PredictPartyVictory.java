package com.algorithm.leetcode.algorithm2025;

import java.util.LinkedList;
import java.util.Queue;

public class PredictPartyVictory {

    public static void main(String[] args) {

//        String senate = "RD";
        String senate = "RDD";
        System.out.println(predictPartyVictory(senate));
    }

    public static String predictPartyVictory(String senate) {

        Queue<Integer> radiantQueue = new LinkedList<>();
        Queue<Integer> direQueue = new LinkedList<>();

        int length = senate.length();
        for (int i = 0; i < length; i++) {
            if (senate.charAt(i) == 'R') {
                radiantQueue.add(i);
            } else {
                direQueue.add(i);
            }
        }

        while (!radiantQueue.isEmpty() && !direQueue.isEmpty()) {
            int radiant = radiantQueue.poll();
            int dire = direQueue.poll();
            if (radiant < dire) {
                radiantQueue.add(radiant + length);
            } else {
                direQueue.add(dire + length);
            }
        }

        return radiantQueue.isEmpty() ? "Dire" : "Radiant";
    }
}
