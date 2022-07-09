package com.algorithm.leetcode.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DecompressRLElist {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
//        int[] nums = {1,1,2,3};
        int[] result = decompressRLElist(nums);
        System.out.println(Arrays.toString(result));
    }

    public static int[] decompressRLElist(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i += 2) {
            for (int j = 0; j < nums[i]; j++) {
                list.add(nums[i + 1]);
            }
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}
