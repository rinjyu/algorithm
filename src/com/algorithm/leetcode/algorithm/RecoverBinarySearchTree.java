package com.algorithm.leetcode.algorithm;

import java.util.Stack;

public class RecoverBinarySearchTree {
    
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

    public static void recoverTree(TreeNode root) {
        TreeNode current = root;
        TreeNode prev = null;
        TreeNode first = null;
        TreeNode second = null;
        Stack<TreeNode> stack = new Stack<>();
        if (root == null) {
            return;
        }
        while (current != null || !stack.isEmpty()) {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }
            current = stack.pop();
            if (prev != null && current.val < prev.val && first == null) {
                first = prev;
            }
            if (prev != null && current.val < prev.val && first != null) {
                second = current;
            }
            prev = current;
            current = current.right;
        }
        swap(first, second);
    }

    private static void swap(TreeNode first, TreeNode second) {
        int temp = first.val;
        first.val = second.val;
        second.val = temp;
    }
}
