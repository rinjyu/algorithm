package com.algorithm.leetcode.algorithm;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeLevelOrderTraversal {

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

    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        backtracking(root, result, 0);
        return result;
    }

    private static void backtracking(TreeNode root, List<List<Integer>> list, int level) {
        if (root == null) {
            return;
        }
        if (list.size() == level) {
            list.add(new ArrayList<>());
        }
        list.get(level).add(root.val);
        backtracking(root.left, list, level + 1);
        backtracking(root.right, list, level + 1);
    }
}
