package com.algorithm.leetcode.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RestoreIPAddresses {

    public static void main(String[] args) {
        String s = "25525511135";
        List<String> result = restoreIpAddresses(s);
        System.out.println(Arrays.toString(result.toArray()));
    }

    public static List<String> restoreIpAddresses(String s) {
        if (!isValidString(s)) {
            return new ArrayList<>();
        }
        List<String> result = new ArrayList<>();
        List<String> list = new ArrayList<>();
        backtracking(s, 0, list, result);
        return result;
    }

    private static void backtracking(String s, int index, List<String> list, List<String> result) {
        if (list.size() > 4) {
            return;
        }
        if (index == s.length() && list.size() == 4) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).length() > 1 && list.get(i).charAt(0) == '0') {
                    return;
                }
                sb.append(list.get(i));
                if (i != list.size() - 1) {
                    sb.append(".");
                }
            }
            result.add(sb.toString());
            return;
        }

        for (int i = index; i < s.length(); i++) {
            String number = s.substring(index, i + 1);
            if (number.length() > 3) {
                break;
            }
            if (Integer.parseInt(number) >= 0 && Integer.parseInt(number) <= 255) {
                list.add(number);
                backtracking(s, i + 1, list, result);
                list.remove(list.size() - 1);
            }
        }
    }

    private static boolean isValidString(String s) {
        return !s.isBlank() && s.length() >= 1 && s.length() <= 20;
    }
}
