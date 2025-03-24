package com.algorithm.leetcode.algorithm2025;

public class GreatestCommonDivision {

    public static void main(String[] args) {

//        String str1 = "ABCABC";
//        String str2 = "ABC";

        String str1 = "ABABAB";
        String str2 = "ABAB";

//        String str1 = "LEET";
//        String str2 = "CODE";

        System.out.println(gcdOfStrings(str1, str2));
    }

//    public static String gcdOfStrings(String str1, String str2) {
//
//        if (!(str1 + str2).equals(str2 + str1)) {
//            return "";
//        }
//
//        int gcdLength = BigInteger.valueOf(str1.length()).gcd(BigInteger.valueOf(str2.length())).intValue();
//        return str1.substring(0, gcdLength);
//    }

    public static String gcdOfStrings(String str1, String str2) {

        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }

        int gcdLength = getGcd(str1.length(), str2.length());
        return str1.substring(0, gcdLength);
    }

    public static int getGcd(int n1, int n2) {
        return n2 == 0 ? n1 : getGcd(n2, n1 % n2);
    }
}
