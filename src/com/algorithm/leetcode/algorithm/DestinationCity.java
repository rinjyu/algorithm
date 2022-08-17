package com.algorithm.leetcode.algorithm;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DestinationCity {

    public static void main(String[] args) {
        String[][] array = {{"London", "New York"}, {"New York", "Lima"}, {"Lima", "Sao Paulo"}};
//        String[][] array = {{"B", "C"}, {"D", "B"}, {"C", "A"}};
//        String[][] array = {{"A", "Z"}};
        List<List<String>> paths = Arrays.stream(array).map(Arrays::asList).collect(Collectors.toList());
        String result = destCity(paths);
        System.out.println(result);
    }

    public static String destCity(List<List<String>> paths) {
        String result = "";
        Map<String, String> map = new HashMap<>();
        for (List<String> path : paths) {
            map.put(path.get(0), path.get(1));
        }
        for (String city : map.values()) {
            if (!map.containsKey(city)) {
                result = city;
                break;
            }
        }
        return result;
    }
}
