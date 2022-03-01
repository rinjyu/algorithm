package com.algorithm.leetcode.algorithm;

import java.util.Arrays;
import java.util.Objects;

public class SudokuSolver {

    public static void main(String[] args) {
        char[][] board = {
            {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
            {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
            {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
            {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
            {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
            {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
            {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
            {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
            {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
        solveSudoku(board);
        for (char[] chars : board) {
            System.out.println(Arrays.toString(chars));
        }
    }

    public static void solveSudoku(char[][] board) {
        if (!isValidArray(board)) {
            return;
        }
        makeSudoku(board);
    }

    private static boolean makeSudoku(char[][] board) {
        int row = -1;
        int column = -1;

        Loop:
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == '.') {
                    row = i;
                    column = j;
                    break Loop;
                }
            }
        }

        if (row == -1) {
            return true;
        }

        for (int i = 1; i < board.length + 1; i++) {
            char ch = (char) ((int) '0' + i);
            if (isValidSudoku(board, ch, row, column)) {
                board[row][column] = ch;
                if (!makeSudoku(board)) {
                    board[row][column] = '.';
                } else {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean isValidSudoku(char[][] board, char ch, int row, int column) {
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] == ch || board[i][column] == ch) {
                return false;
            }
        }
        int blockRow = row / 3;
        int blockColumn = column / 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[(blockRow * 3) + i][(blockColumn * 3) + j] == ch) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean isValidArray(char[][] board) {
        return !Objects.isNull(board) && board.length <= 9;
    }
}