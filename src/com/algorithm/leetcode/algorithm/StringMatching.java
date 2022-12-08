package com.algorithm.leetcode.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringMatching {

    public static void main(String[] args) {
        String[] words = {"mass", "as", "hero", "superhero"};
//        String[] words = {"leetcode", "et", "code"};
//        String[] words = {"blue", "green", "bu"};
        List<String> result = stringMatching(words);
        System.out.println(Arrays.toString(result.toArray()));
    }

    public static List<String> stringMatching(String[] words) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (i != j) {
                    if (words[j].contains(words[i])) {
                        result.add(words[i]);
                        break;
                    }
                }
            }
        }
        return result;
    }
}
