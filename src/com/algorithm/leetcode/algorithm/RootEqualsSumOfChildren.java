package com.algorithm.leetcode.algorithm;

public class RootEqualsSumOfChildren {

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

    public static boolean checkTree(TreeNode root) {
        return root.val == (root.left.val + root.right.val);
    }
}
