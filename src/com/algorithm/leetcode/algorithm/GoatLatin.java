package com.algorithm.leetcode.algorithm;

public class GoatLatin {

    public static void main(String[] args) {
        String sentence = "I speak Goat Latin";
//        String sentence = "The quick brown fox jumped over the lazy dog";
        String result = toGoatLatin(sentence);
        System.out.println(result);
    }

    public static String toGoatLatin(String sentence) {
        StringBuilder result = new StringBuilder();
        StringBuilder suffix = new StringBuilder("a");

        for (String w : sentence.split(" ")) {
            if (result.length() > 0) {
                result.append(" ");
            }

            char c = w.charAt(0);
            if (isVowel(c)) {
                result.append(w);
            } else {
                result.append(w.substring(1));
                result.append(c);
            }

            result.append("ma").append(suffix);
            suffix.append("a");
        }
        return result.toString();
    }

    private static boolean isVowel(char s) {
        boolean result;
        switch (s) {
            case 'a':
            case 'A':
            case 'e':
            case 'E':
            case 'i':
            case 'I':
            case 'o':
            case 'O':
            case 'u':
            case 'U':
                result = true;
                break;
            default:
                result = false;
                break;
        }
        return result;
    }
}
