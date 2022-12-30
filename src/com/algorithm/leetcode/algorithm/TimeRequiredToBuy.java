package com.algorithm.leetcode.algorithm;

public class TimeRequiredToBuy {

    public static void main(String[] args) {
        int[] tickets = {2, 3, 2};
        int k = 2;
//        int[] tickets = {5, 1, 1, 1};
//        int k = 0;
        int result = timeRequiredToBuy(tickets, k);
        System.out.println(result);
    }

    public static int timeRequiredToBuy(int[] tickets, int k) {
        int count = 0;
        while (tickets[k] > 0) {
            for (int i = 0; i < tickets.length; i++) {
                if (tickets[i] > 0) {
                    tickets[i] -= 1;
                    count++;
                }
                if (tickets[k] == 0) {
                    break;
                }
            }
        }
        return count;
    }
}
