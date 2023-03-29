package com.algorithm.leetcode.algorithm;

import java.time.LocalDate;

public class DayOfYear {

    public static void main(String[] args) {
        String date = "2019-01-09";
//        String date = "2019-02-10";
        int result = dayOfYear(date);
        System.out.println(result);
    }

    public static int dayOfYear(String date) {
        return LocalDate.parse(date).getDayOfYear();
    }
}
