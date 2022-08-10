package com.algorithm.leetcode.algorithm;

public class Maximum69Number {

    public static void main(String[] args) {
        int num = 9669;
//        int num = 9996;
//        int num = 9999;
        int result = maximum69Number(num);
        System.out.println(result);
    }

    public static int maximum69Number (int num) {
        int max = num;
        String target = Integer.toString(num);
        for (int i = 0; i < target.length(); i++) {
            int number = maxNumberOfTransformed(num, target,  i);
            max = Integer.max(max, number);
        }
        return max;
    }

    private static int maxNumberOfTransformed(int originNumber, String target, int index) {
        StringBuilder transformedBuilder = new StringBuilder(target);
        if (target.charAt(index) == '6') {
            transformedBuilder.setCharAt(index, '9');
        } else {
            transformedBuilder.setCharAt(index, '6');
        }
        int changeNumber = Integer.parseInt(transformedBuilder.toString());
        return Integer.max(originNumber, changeNumber);
    }
}
