package com.algorithm.leetcode.algorithm;

import java.util.Calendar;

public class DayOfTheWeek {

    public static void main(String[] args) {
        int day = 31;
        int month = 8;
        int year = 2019;
//        int day = 18;
//        int month = 7;
//        int year = 1999;
//        int day = 15;
//        int month = 8;
//        int year = 1993;
        String result = dayOfTheWeek(day, month, year);
        System.out.println(result);
    }

    public static String dayOfTheWeek(int day, int month, int year) {
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day);
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        return days[dayOfWeek - 1];
    }
}
