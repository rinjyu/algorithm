package com.algorithm.leetcode.algorithm2025;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KidsWithCandies {

    public static void main(String[] args) {

//        int[] candies = {2,3,5,1,3};
//        int extraCandies = 3;

//        int[] candies = {4,2,1,1,2};
//        int extraCandies = 1;

        int[] candies = {12,1,12};
        int extraCandies = 10;
        System.out.println(kidsWithCandies(candies, extraCandies));
    }

    private static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        List<Boolean> result = new ArrayList<>();
        int maxCandies = Arrays.stream(candies).max().getAsInt();
        for (int candy : candies) {
            result.add((candy + extraCandies) >= maxCandies);
        }

        return result;
    }
}
