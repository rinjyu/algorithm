package com.algorithm.leetcode.algorithm;

import java.util.Arrays;
import java.util.Objects;

public class FlipAndInvertImage {

    public static void main(String[] args) {
        int[][] image = {{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
//        int[][] image = {{1, 1, 0, 0}, {1, 0, 0, 1}, {0, 1, 1, 1}, {1, 0, 1, 0}};
        int[][] result = flipAndInvertImage(image);
        for (int[] n : result) {
            System.out.println(Arrays.toString(n));
        }
    }

    public static int[][] flipAndInvertImage(int[][] image) {
        if (Objects.isNull(image)) {
            return image;
        }

        for (int[] n : image) {
            for (int i = 0, j = n.length - 1; i <= j; i++, j--) {
                int temp = n[i];
                n[i] = 1 - n[j];
                n[j] = 1 - temp;
            }
        }
        return image;
    }
}
