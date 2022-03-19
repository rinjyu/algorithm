package com.algorithm.leetcode.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NQueens {

    public static void main(String[] args) {
        int n = 4;
//        int n = 1;
        List<List<String>> result = solveNQueens(n);
        System.out.println(Arrays.toString(result.toArray()));
    }

    public static List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        char[][] board = new char[n][n];
        for (char[] c : board) {
            Arrays.fill(c, '.');
        }
        backtracking(board, 0, result, n);
        return result;
    }

    private static void backtracking(char[][] board, int row, List<List<String>> result, int n) {
        if (row == n) {
            List<String> list = new ArrayList<>();
            for (char[] c : board) {
                list.add(String.valueOf(c));
            }
            result.add(list);
            return;
        }

        for (int col = 0; col < n; col++) {
            if (isValidBoard(board, row, col, n)) {
                board[row][col] = 'Q';
                backtracking(board, row + 1, result, n);
                board[row][col] = '.';
            }
        }
    }

    private static boolean isValidBoard(char[][] board, int row, int col, int n) {
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        for (int i = row, j = col; i >= 0 && j < n; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }
}