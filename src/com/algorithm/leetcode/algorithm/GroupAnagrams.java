package com.algorithm.leetcode.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class GroupAnagrams {

    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
//        String[] strs = {""};
//        String[] strs = {"a"};
        List<List<String>> result = groupAnagrams(strs);
        System.out.println(Arrays.toString(result.toArray()));
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        if (!isValidArray(strs)) {
            return new ArrayList<>();
        }
        List<List<String>> result = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        List<String> list;
        for (String s : strs) {
            char[] c = s.toCharArray();
            String key = sortedString(c);
            list = map.containsKey(key) ? map.get(key) : new ArrayList<>();
            list.add(s);
            map.put(key, list);
        }

        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            result.add(entry.getValue());
        }
        return result;
    }

    private static String sortedString(char[] chars) {
        Arrays.sort(chars);
        StringBuilder stringBuilder = new StringBuilder();
        for (Character c : chars) {
            stringBuilder.append(c);
        }
        return stringBuilder.toString();
    }

    private static boolean isValidArray(String[] strs) {
        return !Objects.isNull(strs) && strs.length >= 1 && strs.length <= 10_000;
    }
}