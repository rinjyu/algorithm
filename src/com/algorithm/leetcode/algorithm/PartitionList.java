package com.algorithm.leetcode.algorithm;

public class PartitionList {

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

    public static ListNode partition(ListNode head, int x) {
        ListNode prevHead = new ListNode(0);
        ListNode prev = prevHead;
        ListNode nextHead = new ListNode(0);
        ListNode next = nextHead;

        while (head != null) {
            if (head.val < x) {
                prev.next = head;
                prev = prev.next;
            } else {
                next.next = head;
                next = next.next;
            }
            head = head.next;
        }
        next.next = null;
        prev.next = nextHead.next;
        return prevHead.next;
    }
}