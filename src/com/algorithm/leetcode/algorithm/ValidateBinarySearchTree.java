package com.algorithm.leetcode.algorithm;

public class ValidateBinarySearchTree {

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

    public static boolean isValidBST(TreeNode root) {
        return backtracking(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private static boolean backtracking(TreeNode root, long min, long max) {
        if (root == null) {
            return true;
        } else if (root.val <= min || root.val >= max) {
            return false;
        } else {
            return backtracking(root.left, min, root.val) && backtracking(root.right, root.val, max);
        }
    }
}
