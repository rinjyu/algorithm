package com.algorithm.leetcode.algorithm;

import java.util.Arrays;

public class MyHashMap {

    private int[] array;
    private int size = 1;

    public MyHashMap() {
        array = new int[size];
        Arrays.fill(array, -1);
    }

    public void put(int key, int value) {
        if (key >= size) {
            int[] tempArray = new int[size + key + 1];
            Arrays.fill(tempArray, -1);
            System.arraycopy(array, 0, tempArray, 0, size);
            size = tempArray.length;
            array = tempArray;
        }
        array[key] = value;
    }

    public int get(int key) {
        if (key >= size) {
            return -1;
        } else {
            return array[key];
        }
    }

    public void remove(int key) {
        if (key < size) {
            array[key] = -1;
        }
    }

    public static void main(String[] args) {
        MyHashMap myHashMap = new MyHashMap();
        myHashMap.put(1, 1);
        myHashMap.put(2, 2);
        myHashMap.get(1);
        myHashMap.get(3);
        myHashMap.put(2, 1);
        myHashMap.get(2);
        myHashMap.remove(2);
        myHashMap.get(2);
    }
}