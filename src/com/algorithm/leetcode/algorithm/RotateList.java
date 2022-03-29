package com.algorithm.leetcode.algorithm;

public class RotateList {

    public static class ListNode {

        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) {
            return head;
        }
        int count = 0;
        ListNode currentNode = head;
        while (currentNode != null) {
            count++;
            currentNode = currentNode.next;
        }
        return rotate(head, k % count);
    }

    private static ListNode rotate(ListNode head, int k) {
        if (k == 0) {
            return head;
        }
        ListNode prevNode = head;
        ListNode tailNode = prevNode.next;
        while (tailNode.next != null) {
            prevNode = prevNode.next;
            tailNode = tailNode.next;
        }
        tailNode.next = head;
        prevNode.next = null;
        return rotate(tailNode, k - 1);
    }
}