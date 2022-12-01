package com.algorithm.leetcode.algorithm;

import java.util.Arrays;

public class AnswerQueries {

    public static void main(String[] args) {
        int[] nums = {4, 5, 2, 1};
        int[] queries = {3, 10, 21};
//        int[] nums = {2, 3, 4, 5};
//        int[] queries = {1};
        int[] result = answerQueries(nums, queries);
        System.out.println(Arrays.toString(result));
    }

    public static int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);
        int[] result = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int sum = 0;
            int j;
            for (j = 0; j < nums.length; j++) {
                sum += nums[j];
                if (sum > queries[i]) {
                    result[i] = j;
                    break;
                }
            }
            if (j == nums.length) {
                result[i] = j;
            }
        }
        return result;
    }
}
