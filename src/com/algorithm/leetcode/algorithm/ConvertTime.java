package com.algorithm.leetcode.algorithm;

public class ConvertTime {

    public static void main(String[] args) {
        String current = "02:30";
        String correct = "04:35";
//        String current = "11:00";
//        String correct = "11:01";
        int result = convertTime(current, correct);
        System.out.println(result);
    }

    public static int convertTime(String current, String correct) {
        String[] currents = current.split(":");
        String[] corrects = correct.split(":");
        int convertCurrent = convertTimeNumber(currents[0], currents[1]);
        int covertCorrect = convertTimeNumber(corrects[0], corrects[1]);
        int count = 0;
        while (convertCurrent + 60 <= covertCorrect) {
            count++;
            convertCurrent += 60;
        }
        while (convertCurrent + 15 <= covertCorrect) {
            count++;
            convertCurrent += 15;
        }
        while (convertCurrent + 5 <= covertCorrect) {
            count++;
            convertCurrent += 5;
        }
        while (convertCurrent + 1 <= covertCorrect) {
            count++;
            convertCurrent += 1;
        }
        return count;
    }

    private static int convertTimeNumber(String hour, String minutes) {
        return Integer.parseInt(hour) * 60 + Integer.parseInt(minutes);
    }
}
