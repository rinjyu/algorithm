package com.algorithm.leetcode.algorithm;

import java.util.HashMap;
import java.util.Map;

public class ReformatDate {

    public static void main(String[] args) {
        String date = "20th Oct 2052";
//        String date = "6th Jun 1933";
//        String date = "26th May 1960";
        String result = reformatDate(date);
        System.out.println(result);
    }

    public static String reformatDate(String date) {
        String[] dates = date.split(" ");
        StringBuilder result = new StringBuilder();
        result.append(dates[dates.length - 1]);
        result.append("-");
        result.append(getMonth(dates[1]));
        result.append("-");

        String reformatDate = dates[0].toLowerCase()
                .replace("st", "")
                .replace("nd", "")
                .replace("rd", "")
                .replace("th", "");
        if (reformatDate.length() != 2) {
            reformatDate = "0" + reformatDate;
        }
        result.append(reformatDate);
        return result.toString();
    }

    private static String getMonth(String date) {
        Map<String, String> month = new HashMap<>();
        month.put("Jan", "01");
        month.put("Feb", "02");
        month.put("Mar", "03");
        month.put("Apr", "04");
        month.put("May", "05");
        month.put("Jun", "06");
        month.put("Jul", "07");
        month.put("Aug", "08");
        month.put("Sep", "09");
        month.put("Oct", "10");
        month.put("Nov", "11");
        month.put("Dec", "12");
        return month.get(date);
    }
}
