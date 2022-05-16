package com.algorithm.leetcode.algorithm;

public class GasStation {

    public static void main(String[] args) {
        int[] gas = {1, 2, 3, 4, 5};
        int[] cost = {3, 4, 5, 1, 2};
//        int[] gas = {2, 3, 4};
//        int[] cost = {3, 4, 3};
        int result = canCompleteCircuit(gas, cost);
        System.out.println(result);
    }

    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int total = 0;
        int current = 0;
        int index = 0;
        for (int i = 0; i < gas.length; i++) {
            total += gas[i] - cost[i];
            current += gas[i] - cost[i];
            if (current < 0) {
                current = 0;
                index = i + 1;
            }
        }
        return total < 0 ? -1 : index;
    }
}
