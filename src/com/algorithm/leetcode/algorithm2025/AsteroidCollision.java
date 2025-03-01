package com.algorithm.leetcode.algorithm2025;

import java.util.Stack;

public class AsteroidCollision {

    public static void main(String[] args) {

//        int[] asteroids = {5, 10, -5};
//        int[] asteroids = {8, -8};
        int[] asteroids = {10, 2, -5};
        System.out.println(asteroidCollision(asteroids));
    }

    public static int[] asteroidCollision(int[] asteroids) {

        Stack<Integer> stack = new Stack<>();

        for (int asteroid : asteroids) {
            boolean destroyed = false;
            while (!stack.isEmpty() && stack.peek() > 0 && asteroid < 0) {
                int top = stack.peek();
                if (Math.abs(top) < Math.abs(asteroid)) {
                    stack.pop();
                    continue;
                } else if (Math.abs(top) == Math.abs(asteroid)) {
                    stack.pop();
                }
                destroyed = true;
                break;
            }
            if (!destroyed) {
                stack.push(asteroid);
            }
        }

        return stack.stream().mapToInt(i -> i).toArray();
    }
}
