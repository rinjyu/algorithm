package com.algorithm.leetcode.algorithm;

public class SortedArrayToBST {

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

    public TreeNode sortedArrayToBST(int[] nums) {
        return backtracking(0, nums.length - 1, nums);
    }

    private TreeNode backtracking(int i, int j, int[] nums) {
        if (i > j) {
            return null;
        }
        int mid = (i + j) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        if (i == j) {
            return node;
        }
        node.left = backtracking(i, mid - 1, nums);
        node.right = backtracking(mid + 1, j, nums);
        return node;
    }
}
