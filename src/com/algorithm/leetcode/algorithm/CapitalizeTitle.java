package com.algorithm.leetcode.algorithm;

public class CapitalizeTitle {

    public static void main(String[] args) {
        String title = "capiTalIze tHe titLe";
//        String title = "First leTTeR of EACH Word";
//        String title = "i lOve leetcode";
        String result = capitalizeTitle(title);
        System.out.println(result);
    }

    public static String capitalizeTitle(String title) {
        String result = "";
        String[] titles = title.toLowerCase().split("\\s+");
        for (int i = 0; i < titles.length; i++) {
            if (titles[i].length() > 2) {
                titles[i] = Character.toUpperCase(titles[i].charAt(0))
                        + titles[i].substring(1, titles[i].length());
            }
            result += titles[i] + " ";
        }
        return result.trim();
    }
}
