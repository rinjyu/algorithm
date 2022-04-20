package com.algorithm.leetcode.algorithm;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesSortedList2 {

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
        Set<Integer> set = new HashSet<>();
        ListNode tempNode = head;
        ListNode currentNode = null;
        while (tempNode != null) {
            if (!set.contains(tempNode.val)) {
                set.add(tempNode.val);
                currentNode = tempNode;
            } else {
                currentNode.next = tempNode.next;
            }
            tempNode = tempNode.next;
        }
        return head;
    }
}