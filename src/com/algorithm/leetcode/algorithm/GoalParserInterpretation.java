package com.algorithm.leetcode.algorithm;

public class GoalParserInterpretation {

    public static void main(String[] args) {
        String command = "G()(al)";
//        String command = "G()()()()(al)";
//        String command = "(al)G(al)()()G";
        String result = interpret(command);
        System.out.println(result);
    }

    public static String interpret(String command) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < command.length(); i++) {
            if (command.charAt(i) == 'G') {
                result.append("G");
            } else if (command.charAt(i) == '(') {
                if (command.charAt(i + 1) == ')') {
                    result.append("o");
                } else {
                    result.append("al");
                }
            }
        }
        return result.toString();
    }
}
