package com.algorithm.leetcode.algorithm;

import java.util.HashSet;
import java.util.Set;

public class NumUniqueEmails {

    public static void main(String[] args) {
        String[] emails = {"test.email+alex@leetcode.com", "test.e.mail+bob.cathy@leetcode.com", "testemail+david@lee.tcode.com"};
    //    String[] emails = {"a@leetcode.com", "b@leetcode.com", "c@leetcode.com"};
        int result = numUniqueEmails(emails);
        System.out.println(result);
    }

    public static int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();
        for (String email : emails) {
            int at = email.indexOf("@");
            int plus = email.indexOf("+");
            String text = email.substring(0, at);
            if (plus > -1) {
                text = email.substring(0, plus);
            }
            text = text.replaceAll("\\.", "") + email.substring(at);
            set.add(text);
        }
        return set.size();
    }
}
