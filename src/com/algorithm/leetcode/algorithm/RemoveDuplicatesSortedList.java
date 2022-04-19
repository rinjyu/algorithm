package com.algorithm.leetcode.algorithm;

public class RemoveDuplicatesSortedList {

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

    public ListNode deleteDuplicates(ListNode head) {
        ListNode tempNode = new ListNode(0, head);
        ListNode prevNode = tempNode;
        while (head != null) {
            if (head.next != null && head.val == head.next.val) {
                while (head.next != null && head.val == head.next.val) {
                    head = head.next;
                }
                prevNode.next = head.next;
            } else {
                prevNode = prevNode.next;
            }
            head = head.next;
        }
        return tempNode.next;
    }
}