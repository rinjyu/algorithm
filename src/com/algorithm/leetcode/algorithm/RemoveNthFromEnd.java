package com.algorithm.leetcode.algorithm;

public class RemoveNthFromEnd {

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

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode listNode = head;
        int count = 0;
        while (listNode != null) {
            listNode = listNode.next;
            count++;
        }
        if (count == n) {
            head = head.next;
            return head;
        }
        listNode = head;
        int index = 0;
        while (listNode != null) {
            index++;
            if (index == count - n) {
                listNode.next = listNode.next.next;
                break;
            }
            listNode = listNode.next;
        }
        return head;
    }
}