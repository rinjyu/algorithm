package com.algorithm.leetcode.algorithm;

import java.util.HashSet;

public class ValidSudoku {

    public static void main(String[] args) {
        char[][] board = {
            {'5', '3', '.', '.', '7', '.', '.', '.', '.'}
            , {'6', '.', '.', '1', '9', '5', '.', '.', '.'}
            , {'.', '9', '8', '.', '.', '.', '.', '6', '.'}
            , {'8', '.', '.', '.', '6', '.', '.', '.', '3'}
            , {'4', '.', '.', '8', '.', '3', '.', '.', '1'}
            , {'7', '.', '.', '.', '2', '.', '.', '.', '6'}
            , {'.', '6', '.', '.', '.', '.', '2', '8', '.'}
            , {'.', '.', '.', '4', '1', '9', '.', '.', '5'}
            , {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
//        char[][] board = {
//            {'8', '3', '.', '.', '7', '.', '.', '.', '.'}
//            , {'6', '.', '.', '1', '9', '5', '.', '.', '.'}
//            , {'.', '9', '8', '.', '.', '.', '.', '6', '.'}
//            , {'8', '.', '.', '.', '6', '.', '.', '.', '3'}
//            , {'4', '.', '.', '8', '.', '3', '.', '.', '1'}
//            , {'7', '.', '.', '.', '2', '.', '.', '.', '6'}
//            , {'.', '6', '.', '.', '.', '.', '2', '8', '.'}
//            , {'.', '.', '.', '4', '1', '9', '.', '.', '5'}
//            , {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
//        };
        boolean result = isValidSudoku(board);
        System.out.println(result);
    }

    public static boolean isValidSudoku(char[][] board) {
        HashSet<String> hashSet = new HashSet<>();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] != '.') {
                    if (hashSet.add("row" + i + board[i][j]) &&
                        hashSet.add("column" + j + board[i][j])) {
                        if (!hashSet.add("box" + ((i / 3) * 3 + j / 3) + board[i][j])) {
                            return false;
                        }
                    } else {
                        return false;
                    }
                }
            }
        }
        return true;
    }

}
