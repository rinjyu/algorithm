package com.algorithm.leetcode.algorithm;

public class WildcardMatching {

    public static void main(String[] args) {
        String s = "aa";
        String p = "a";
//        String s = "aa";
//        String p = "*";
//        String s = "cb";
//        String p = "?a";
        boolean result = isMatch(s, p);
        System.out.println(result);
    }

    public static boolean isMatch(String s, String p) {
        int sLength = s.length();
        if (!isValidLength(sLength)) {
            return false;
        }
        int pLength = p.length();
        if (!isValidLength(pLength)) {
            return false;
        }
        boolean[][] dp = new boolean[pLength + 1][sLength + 1];
        for (int i = 0; i <= pLength; i++) {
            for (int j = 0; j <= sLength; j++) {
                if (i == 0 && j == 0) {
                    dp[i][j] = true;
                } else if (i != 0) {
                    if (j == 0) {
                        dp[i][j] = p.charAt(i - 1) == '*' && dp[i - 1][j];
                    } else {
                        if (p.charAt(i - 1) == '?') {
                            dp[i][j] = dp[i - 1][j - 1];
                        } else if (p.charAt(i - 1) == '*') {
                            dp[i][j] = dp[i][j - 1] || dp[i - 1][j];
                        } else {
                            dp[i][j] = (p.charAt(i - 1) == s.charAt(j-1))  && dp[i-1][j-1];
                        }
                    }
                }
            }
        }
        return dp[pLength][sLength];
    }

    private static boolean isValidLength(int length) {
        return length >= 0 && length <= 2000;
    }
}