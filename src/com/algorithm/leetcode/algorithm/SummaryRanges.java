package com.algorithm.leetcode.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SummaryRanges {

    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 4, 5, 7};
        List<String> result = summaryRanges(nums);
        System.out.println(Arrays.toString(result.toArray()));
    }

    public static List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        if (nums.length == 0) {
            return result;
        }
        int left = nums[0];
        int right = nums[0];
        for (int n : nums) {
            if (n == right) {
                continue;
            }
            if (n == right + 1) {
                right = n;
            } else {
                if (left == right) {
                    result.add(left + "");
                } else {
                    result.add(String.format("%s->%s", left, right));
                }
                left = n;
                right = n;
            }
        }
        if (left == right) {
            result.add(left + "");
        } else {
            result.add(String.format("%s->%s", left, right));
        }
        return result;
    }
}
