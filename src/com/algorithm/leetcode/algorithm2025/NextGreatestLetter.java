package com.algorithm.leetcode.algorithm2025;

public class NextGreatestLetter {

    public static void main(String[] args) {

        char[] letters = {'c','f','j'};
        char target = 'a';

//        char[] letters = {'c','f','j'};
//        char target = 'c';

//        char[] letters = {'x','x','y','y'};
//        char target = 'z';

        System.out.println(nextGreatestLetter(letters, target));
    }

    public static char nextGreatestLetter(char[] letters, char target) {

        int left = 0;
        int right = letters.length - 1;
        while (left <= right) {
            int middle = (left + right) / 2;
            if (letters[middle] <= target) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }

        return letters[left % letters.length];
    }
}
