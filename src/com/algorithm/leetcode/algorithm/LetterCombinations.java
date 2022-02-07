package com.algorithm.leetcode.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinations {

    public static void main(String[] args) {
        String digits = "23";
//        String digits = "";
//        String digits = "2";
        List<String> result = letterCombinations(digits);
        System.out.println(Arrays.toString(result.toArray()));
    }

    public static List<String> letterCombinations(String digits) {
        if (!isValidText(digits)) {
            return new ArrayList<>();
        }
        List<String> result = numberMappingLetter(digits.charAt(0));
        for (int i = 1; i < digits.length(); i++) {
            result = generateCombine(result, numberMappingLetter(digits.charAt(i)));
        }
        return result;
    }

    public static List<String> numberMappingLetter(Character digits) {
        Map<Character, List<String>> listMap = new HashMap<>();
        listMap.put('2', Arrays.asList("a", "b", "c"));
        listMap.put('3', Arrays.asList("d", "e", "f"));
        listMap.put('4', Arrays.asList("g", "h", "i"));
        listMap.put('5', Arrays.asList("j", "k", "l"));
        listMap.put('6', Arrays.asList("m", "n", "o"));
        listMap.put('7', Arrays.asList("p", "q", "r", "s"));
        listMap.put('8', Arrays.asList("t", "u", "v"));
        listMap.put('9', Arrays.asList("w", "x", "y", "z"));
        return listMap.getOrDefault(digits, new ArrayList<>());
    }

    public static List<String> generateCombine(List<String> originList, List<String> newList) {
        List<String> combineList = new ArrayList<>();
        for (String s : originList) {
            for (String t : newList) {
                combineList.add(s + t);
            }
        }
        return combineList;
    }

    public static boolean isValidText(String s) {
        return !s.isBlank() && s.length() <= 4;
    }
}
