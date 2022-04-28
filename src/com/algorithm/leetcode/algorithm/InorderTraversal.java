package com.algorithm.leetcode.algorithm;

import java.util.ArrayList;
import java.util.List;

public class InorderTraversal {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        List<Integer> result = new ArrayList<>();
        backtracking(root, result);
        return result;
    }

    private static void backtracking(TreeNode root, List<Integer> result) {
        if (root != null) {
            backtracking(root.left, result);
            result.add(root.val);
            backtracking(root.right, result);
        }
    }
}
