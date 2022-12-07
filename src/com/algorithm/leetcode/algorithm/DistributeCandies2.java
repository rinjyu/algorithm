package com.algorithm.leetcode.algorithm;

import java.util.Arrays;

public class DistributeCandies2 {

    public static void main(String[] args) {
        int candies = 7;
        int numPeople = 4;
//        int candies = 10;
//        int numPeople = 3;
        int[] result = distributeCandies(candies, numPeople);
        System.out.println(Arrays.toString(result));
    }

    public static int[] distributeCandies(int candies, int numPeople) {
        int[] result = new int[numPeople];
        int count = 0;
        int i = 0;
        while (candies > 0) {
            count++;
            if (count <= candies) {
                candies -= count;
            } else {
                count = candies;
                candies = 0;
            }
            result[i++] += count;
            i %= numPeople;
        }
        return result;
    }
}
