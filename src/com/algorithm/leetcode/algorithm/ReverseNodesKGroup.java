package com.algorithm.leetcode.algorithm;

public class ReverseNodesKGroup {

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

    public static ListNode reverseKGroup(ListNode head, int k) {
        ListNode currentNode = head;
        ListNode nextNode = null;
        ListNode prevNode = null;

        int count = 0;
        while (count < k && currentNode != null) {
            nextNode = currentNode.next;
            currentNode.next = prevNode;
            prevNode = currentNode;
            currentNode = nextNode;
            count++;
        }

        if (nextNode != null) {
            if (nodeCount(nextNode) >= k) {
                head.next = reverseKGroup(nextNode, k);
            } else {
                head.next = nextNode;
            }
        }
        return prevNode;
    }

    public static int nodeCount(ListNode listNode) {
        int count = 0;
        while (listNode != null) {
            count++;
            listNode = listNode.next;
        }
        return count;
    }
}
