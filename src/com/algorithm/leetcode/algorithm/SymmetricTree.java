package com.algorithm.leetcode.algorithm;

public class SymmetricTree {

    public class TreeNode {

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

    public static boolean isSymmetric(TreeNode root) {
        return backtracking(root.left, root.right);
    }

    private static boolean backtracking(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) {
            return true;
        }
        if (root1 != null && root2 == null
                || root1 == null && root2 != null
                || root1.val != root2.val) {
            return false;
        }
        return backtracking(root1.left, root2.right)
                && backtracking(root1.right, root2.left);
    }
}
