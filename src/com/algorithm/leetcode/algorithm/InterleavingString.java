package com.algorithm.leetcode.algorithm;

public class InterleavingString {

    public static void main(String[] args) {
        String s1 = "aabcc";
        String s2 = "dbbca";
        String s3 = "aadbbcbcac";
//        String s1 = "";
//        String s2 = "";
//        String s3 = "";
        boolean result = isInterleave(s1, s2, s3);
        System.out.println(result);
    }

    public static boolean isInterleave(String s1, String s2, String s3) {
        int length1 = s1.length();
        int length2 = s2.length();
        int length3 = s3.length();
        if (length1 + length2 != length3) {
            return false;
        }
        if (length1 == 0) {
            return s2.equals(s3);
        }
        if (length2 == 0) {
            return s1.equals(s3);
        }

        boolean[][] result = new boolean[length1 + 1][length2 + 1];
        result[length1][length2] = true;
        for (int i = length2 - 1; i >= 0; i--) {
            if (!result[length1][i + 1]) {
                break;
            }
            result[length1][i] = (s2.charAt(i) == s3.charAt(i + length1));
        }
        for (int i = length1 - 1; i >= 0; i--) {
            if (!result[i + 1][length2]) {
                break;
            }
            result[i][length2] = (s1.charAt(i) == s3.charAt(i + length2));
        }
        for (int i = length1 - 1; i >= 0; i--) {
            for (int j = length2 - 1; j >= 0; j--) {
                result[i][j] = (s1.charAt(i) == s3.charAt(i + j) && result[i + 1][j])
                        || (s2.charAt(j) == s3.charAt(i + j) && result[i][j + 1]);
            }
        }
        return result[0][0];
    }
}
