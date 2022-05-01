package com.algorithm.leetcode.algorithm;

import java.util.ArrayList;
import java.util.List;

public class UniqueBinarySearchTrees {

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

    public static List<TreeNode> generateTrees(int n) {
        return backtracking(1, n);
    }

    private static List<TreeNode> backtracking(int start, int end) {
        if (start > end) {
            List<TreeNode> treeNodeList = new ArrayList<>();
            treeNodeList.add(null);
            return treeNodeList;
        }

        List<TreeNode> result = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            List<TreeNode> left = backtracking(start, i - 1);
            List<TreeNode> right = backtracking(i + 1, end);

            for (TreeNode leftTreeNode : left) {
                for (TreeNode rightTreeNode : right) {
                    TreeNode node = new TreeNode(i);
                    node.left = leftTreeNode;
                    node.right = rightTreeNode;
                    result.add(node);
                }
            }
        }
        return result;
    }
}
