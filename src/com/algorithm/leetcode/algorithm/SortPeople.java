package com.algorithm.leetcode.algorithm;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class SortPeople {

    public static void main(String[] args) {
        String[] names = {"Mary", "John", "Emma"};
        int[] heights = {180, 165, 170};
//        String[] names = {"Alice", "Bob", "Bob"};
//        int[] heights = {155, 185, 150};
        String[] result = sortPeople(names, heights);
        System.out.println(Arrays.toString(result));
    }

    public static String[] sortPeople(String[] names, int[] heights) {
        Map<Integer, String> map = new HashMap<>();
        for (int i = 0; i < names.length; i++) {
            map.put(heights[i], names[i]);
        }
        PriorityQueue<Map.Entry<Integer, String>> priorityQueue = new PriorityQueue<>((a, b) -> b.getKey() - a.getKey());
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            priorityQueue.add(entry);
        }
        for (int j = 0; j < names.length; j++) {
            names[j] = priorityQueue.poll().getValue();
        }
        return names;
    }
}
