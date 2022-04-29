package com.algorithm.leetcode.algorithm;

public class ReverseLinkedList {

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

    public static ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null) {
            return null;
        }
        ListNode node = new ListNode(0);
        node.next = head;
        ListNode prevNode = node;
        for (int i = 1; i < left; i++) {
            prevNode = prevNode.next;
        }
        ListNode currentNode = prevNode.next;
        for (int i = left; i < right; i++) {
            ListNode nextNode = currentNode.next;
            currentNode.next = nextNode.next;
            nextNode.next = prevNode.next;
            prevNode.next = nextNode;
        }
        return node.next;
    }
}
