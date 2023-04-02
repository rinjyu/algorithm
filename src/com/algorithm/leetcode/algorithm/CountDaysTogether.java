package com.algorithm.leetcode.algorithm;

public class CountDaysTogether {

    public static void main(String[] args) {
        String arriveAlice = "08-15";
        String leaveAlice = "08-18";
        String arriveBob = "08-16";
        String leaveBob = "08-19";
//        String arriveAlice = "10-01";
//        String leaveAlice = "10-31";
//        String arriveBob = "11-01";
//        String leaveBob = "12-31";
        int result = countDaysTogether(arriveAlice, leaveAlice, arriveBob, leaveBob);
        System.out.println(result);
    }

    public static int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int arriveAliceDay = days(arriveAlice);
        int leaveAliceDay = days(leaveAlice);
        int arriveBobDay = days(arriveBob);
        int leaveBobDay = days(leaveBob);
        if (leaveAliceDay < arriveBobDay || leaveBobDay < arriveAliceDay) {
            return 0;
        }
        return Math.abs(Math.max(arriveAliceDay, arriveBobDay) - Math.min(leaveAliceDay, leaveBobDay)) + 1;
    }

    private static int days(String str) {
        int[] month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int sum = 0;
        int m = Integer.valueOf(str.substring(0, 2));
        int d = Integer.valueOf(str.substring(3, 5));
        for (int i = 0; i < m - 1; i++) {
            sum += month[i];
        }
        return d + sum;
    }
}
