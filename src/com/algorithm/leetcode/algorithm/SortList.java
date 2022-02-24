package com.algorithm.leetcode.algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortList {

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

    public ListNode sortList(ListNode head) {
        if (head == null) {
            return null;
        }
        List<Integer> list = new ArrayList<>();
        ListNode node = head;
        while (node != null) {
            list.add(node.val);
            node = node.next;
        }
        Collections.sort(list);
        ListNode tempNode = new ListNode(0);
        ListNode currentNode = tempNode;
        for (Integer integer : list) {
            currentNode.next = new ListNode(integer);
            currentNode = currentNode.next;
        }
        currentNode.next = null;
        return tempNode.next;
    }
}
