package com.algorithm.leetcode.algorithm;

import java.util.Arrays;

public class ConvertTemperature {

    public static void main(String[] args) {
        double celsius = 36.50;
        double[] result = convertTemperature(celsius);
        System.out.println(Arrays.toString(result));
    }

    public static double[] convertTemperature(double celsius) {
        double[] result = new double[2];
        result[0] = celsius + 273.15;
        result[1] = celsius * 1.80 + 32.00;
        return result;
    }
}
