package com.algorithm.leetcode.algorithm;

public class CountStudents {

    public static void main(String[] args) {
        int[] students = {1,1,0,0};
        int[] sandwiches = {0,1,0,1};
//        int[] students = {1, 1, 1, 0, 0, 1};
//        int[] sandwiches = {1, 0, 0, 0, 1, 1};
        int result = countStudents(students, sandwiches);
        System.out.println(result);
    }

    public static int countStudents(int[] students, int[] sandwiches) {
        int[] array = {0, 0};
        for (int i = 0; i < students.length; i++) {
            array[students[i]] += 1;
        }
        int i = 0;
        while (i < sandwiches.length) {
            if (array[sandwiches[i]] > 0) {
                array[sandwiches[i]] -= 1;
            } else {
                break;
            }
            i++;
        }
        return sandwiches.length - i;
    }
}
