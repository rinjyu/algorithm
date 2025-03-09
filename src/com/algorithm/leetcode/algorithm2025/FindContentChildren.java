package com.algorithm.leetcode.algorithm2025;

import java.util.Arrays;

public class FindContentChildren {

    public static void main(String[] args) {
        int[] g = {1, 2, 3};
        int[] s = {1, 1};
//        int[] g = {1, 2};
//        int[] s = {1, 2, 3};
        System.out.println(findContentChildren(g, s));
    }

    public static int findContentChildren(int[] g, int[] s) {

        Arrays.sort(g);
        Arrays.sort(s);

        int child = 0;
        int cookie = 0;

        while (child < g.length && cookie < s.length) {
            if (s[cookie] >= g[child]) {
                child++;
            }
            cookie++;
        }

        return child;
    }
}
