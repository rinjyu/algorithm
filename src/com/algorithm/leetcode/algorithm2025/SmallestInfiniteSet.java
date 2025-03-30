package com.algorithm.leetcode.algorithm2025;

import java.util.TreeSet;

public class SmallestInfiniteSet {

    private static TreeSet<Integer> treeSet;

    private int smallNumber;

    public SmallestInfiniteSet() {
        treeSet = new TreeSet<>();
        smallNumber = 1;
    }

    public int popSmallest() {
        if (!treeSet.isEmpty()) {
            return treeSet.pollFirst();
        }
        return smallNumber++;
    }

    public void addBack(int num) {
        if (num < smallNumber && !treeSet.contains(num)) {
            treeSet.add(num);
        }
    }

    public static void main(String[] args) {

        SmallestInfiniteSet smallestInfiniteSet = new SmallestInfiniteSet();
        System.out.println(treeSet);
        smallestInfiniteSet.addBack(2);
        System.out.println(treeSet);
        smallestInfiniteSet.popSmallest();
        System.out.println(treeSet);
        smallestInfiniteSet.popSmallest();
        System.out.println(treeSet);
        smallestInfiniteSet.popSmallest();
        System.out.println(treeSet);
        smallestInfiniteSet.addBack(1);
        System.out.println(treeSet);
        smallestInfiniteSet.popSmallest();
        System.out.println(treeSet);
        smallestInfiniteSet.popSmallest();
        System.out.println(treeSet);
        smallestInfiniteSet.popSmallest();
        System.out.println(treeSet);
    }
}
