package com.algorithm.leetcode.algorithm;

public class SlowestKey {

    public static void main(String[] args) {
        int[] releaseTimes = {9, 29, 49, 50};
        String keyPressed = "cbcd";
//        int[] releaseTimes = {12, 23, 36, 46, 62};
//        String keyPressed = "spuda";
        char result = slowestKey(releaseTimes, keyPressed);
        System.out.println(result);
    }

    public static char slowestKey(int[] releaseTimes, String keysPressed) {
        int length = releaseTimes.length;
        int max = releaseTimes[0];
        char c = keysPressed.charAt(0);
        for (int i = 1; i < length; i++) {
            int temp = releaseTimes[i] - releaseTimes[i - 1];
            if ((temp > max) || (temp == max && keysPressed.charAt(i) > c)) {
                max = temp;
                c = keysPressed.charAt(i);
            }
        }
        return c;
    }
}
