package com.algorithm.leetcode.algorithm;

public class SwapNodePairs {

    public static class ListNode {

        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode listNode) {
            this.val = val;
            this.next = listNode;
        }
    }

    public static ListNode swapPairs(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode current = head;
        while (current != null && current.next != null) {
            int temp = current.val;
            current.val = current.next.val;
            current.next.val = temp;
            current = current.next.next;
        }
        return head;
    }
}
