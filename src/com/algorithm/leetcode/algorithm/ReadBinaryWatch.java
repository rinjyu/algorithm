package com.algorithm.leetcode.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReadBinaryWatch {

    public static void main(String[] args) {
        int turnedOn = 1;
//        int turnedOn = 9;
        List<String> result = readBinaryWatch(turnedOn);
        System.out.println(Arrays.toString(result.toArray()));
    }

    public static List<String> readBinaryWatch(int turnedOn) {
        List<String> result = new ArrayList<>();
        for (int h = 0; h < 12; h++) {
            for (int m = 0; m < 60; m++) {
                if (Integer.bitCount(h) + Integer.bitCount(m) == turnedOn) {
                    result.add(String.format("%d:%02d", h, m));
                }
            }
        }
        return result;
    }
}
