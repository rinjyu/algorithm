package com.algorithm.leetcode.algorithm;

public class DefangIPaddr {

    public static void main(String[] args) {
        String address = "1.1.1.1";
//        String address = "255.100.50.0";
        String result = defangIPaddr(address);
        System.out.println(result);
    }

    public static String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }
}
