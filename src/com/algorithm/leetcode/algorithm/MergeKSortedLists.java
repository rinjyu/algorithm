package com.algorithm.leetcode.algorithm;

public class MergeKSortedLists {

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

    public static ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) {
            return null;
        }
        if (lists.length == 1) {
            return lists[0];
        }
        ListNode headListNode = mergeTwoLists(lists[0], lists[1]);
        for (int i = 2; i < lists.length; i++) {
            headListNode = mergeTwoLists(headListNode, lists[i]);
        }
        return headListNode;
    }
    
    public static ListNode mergeTwoLists(ListNode listNode1, ListNode listNode2) {
        ListNode headListNode = new ListNode(0);
        ListNode resultListNode = headListNode;
        while (listNode1 != null && listNode2 != null) {
            if (listNode1.val < listNode2.val) {
                headListNode.next = listNode1;
                headListNode = headListNode.next;
                listNode1 = listNode1.next;
            } else {
                headListNode.next = listNode2;
                headListNode = headListNode.next;
                listNode2 = listNode2.next;
            }
        }
        if (listNode1 == null) {
            headListNode.next = listNode2;
        }
        if (listNode2 == null) {
            headListNode.next = listNode1;
        }
        return resultListNode.next;
    }
}
