package com.algorithm.leetcode.algorithm;

public class MaxNumberOfBalloons {

    public static void main(String[] args) {
        String text = "nlaebolko";
//        String text = "loonbalxballpoon";
//        String text = "leetcode";
        int result = maxNumberOfBalloons(text);
        System.out.println(result);
    }

    public static int maxNumberOfBalloons(String text) {
        int a = 0;
        int b = 0;
        int l = 0;
        int o = 0;
        int n = 0;
        for (char c : text.toCharArray()) {
            if (c == 'b') {
                b++;
            } else if (c == 'a') {
                a++;
            } else if (c == 'l') {
                l++;
            } else if (c == 'o') {
                o++;
            } else if (c == 'n') {
                n++;
            }
        }
        return Math.min(Math.min(Math.min(b, a), n), Math.min(l / 2, o / 2));
    }
}
