package com.algorithm.leetcode.algorithm;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CountMatches {

    public static void main(String[] args) {
        String[][] itemArray = {{"phone", "blue", "pixel"}, {"computer", "silver", "lenovo"}, {"phone", "gold", "iphone"}};
        List<List<String>> items = Arrays.stream(itemArray).map(Arrays::asList).collect(Collectors.toList());
        String ruleKey = "color";
        String ruleValue = "silver";
//        String[][] itemArray = {{"phone","blue","pixel"},{"computer","silver","phone"},{"phone","gold","iphone"}};
//        String ruleKey = "type";
//        String ruleValue = "phone";
        int result = countMatches(items, ruleKey, ruleValue);
        System.out.println(result);
    }

    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int result = 0;
        for (List<String> list : items) {
            if ("type".equals(ruleKey) && list.get(0).equals(ruleValue)) {
                result++;
            }
            if ("color".equals(ruleKey) && list.get(1).equals(ruleValue)) {
                result++;
            }
            if ("name".equals(ruleKey) && list.get(2).equals(ruleValue)) {
                result++;
            }
        }
        return result;
    }
}
