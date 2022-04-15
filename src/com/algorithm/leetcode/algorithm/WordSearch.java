package com.algorithm.leetcode.algorithm;

public class WordSearch {

    public static void main(String[] args) {
        char[][] board = {{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
//        String word = "ABCCED";
//        String word = "SEE";
        String word = "ABCB";
        boolean result = exist(board, word);
        System.out.println(result);
    }

    public static boolean exist(char[][] board, String word) {
        char[] words = word.toCharArray();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (backtracking(board, words, i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean backtracking(char[][] board, char[] words, int i, int j, int index) {
        if (index == words.length) {
            return true;
        }
        if (i < 0 || j < 0 || i >= board.length || j >= board[i].length || words[index] != board[i][j]) {
            return false;
        }
        char c = board[i][j];
        if (board[i][j] == words[index]) {
            board[i][j] = '-';
            if (backtracking(board, words, i + 1, j, index + 1) ||
                    backtracking(board, words, i, j + 1, index + 1) ||
                    backtracking(board, words, i - 1, j, index + 1) ||
                    backtracking(board, words, i, j - 1, index + 1)) {
                return true;
            }
            board[i][j] = c;
        }
        return false;
    }
}