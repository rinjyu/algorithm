package com.algorithm.leetcode.algorithm;

public class NQueens2 {

    public static void main(String[] args) {
        int n = 4;
//        int n = 1;
        int result = totalNQueens(n);
        System.out.println(result);
    }

    public static int totalNQueens(int n) {
        boolean[][] board = new boolean[n][n];
        return backtracking(board, 0, n);
    }

    private static int backtracking(boolean[][] board, int row, int n) {
        int count = 0;
        if (row == n) {
            return 1;
        }
        for (int col = 0; col < n; col++) {
            if (isValidBoard(board, row, col)) {
                board[row][col] = true;
                count += backtracking(board, row + 1, n);
                board[row][col] = false;
            }
        }
        return count;
    }

    private static boolean isValidBoard(boolean[][] board, int row, int col) {
        for (int i = 0; i < row; i++) {
            if (board[i][col]) {
                return false;
            }
        }
        int maxLeft = Math.min(row, col);
        for (int i = 1; i <= maxLeft; i++) {
            if (board[row - i][col - i]) {
                return false;
            }
        }
        int maxRight = Math.min(row, board.length - col - 1);
        for (int i = 1; i <= maxRight; i++) {
            if (board[row - i][col + i]) {
                return false;
            }
        }
        return true;
    }
}