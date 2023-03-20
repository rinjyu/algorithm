package com.algorithm.leetcode.algorithm;

import java.util.*;

public class FindRestaurant {

    public static void main(String[] args) {
        String[] list1 = {"Shogun", "Tapioca Express", "Burger King", "KFC"};
        String[] list2 = {"Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"};
//        String[] list1 = {"Shogun", "Tapioca Express", "Burger King", "KFC"};
//        String[] list2 = {"KFC", "Shogun", "Burger King"};
//        String[] list1 = {"happy", "sad", "good"};
//        String[] list2 = {"sad", "happy", "good"};
        String[] result = findRestaurant(list1, list2);
        System.out.println(Arrays.toString(result));
    }

    public static String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> map = new HashMap<>();
        List<String> result = new LinkedList<>();
        int sum = Integer.MAX_VALUE;
        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i], i);
        }
        for (int i = 0; i < list2.length; i++) {
            Integer j = map.get(list2[i]);
            if (j != null && i + j <= sum) {
                if (i + j < sum) {
                    result.clear();
                    sum = i + j;
                }
                result.add(list2[i]);
            }
        }
        return result.toArray(new String[result.size()]);
    }
}
