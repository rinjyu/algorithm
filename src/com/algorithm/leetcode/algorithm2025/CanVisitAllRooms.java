package com.algorithm.leetcode.algorithm2025;

import java.util.List;

public class CanVisitAllRooms {

    public static void main(String[] args) {

//        List<List<Integer>> rooms = List.of(List.of(1, 2, 3));

        List<List<Integer>> rooms = List.of(
                List.of(1, 3),
                List.of(3, 0, 1),
                List.of(2),
                List.of(0)
        );

        System.out.println(canVisitAllRooms(rooms));
    }

    public static boolean canVisitAllRooms(List<List<Integer>> rooms) {

        int roomCount = rooms.size();
        boolean[] visited = new boolean[roomCount];
        visited[0] = true;

        int room = 0;
        visitRoom(rooms, room, visited);
        for (boolean visit : visited) {
            if (!visit) {
                return false;
            }
        }

        return true;
    }

    private static void visitRoom(List<List<Integer>> rooms, int room, boolean[] visited) {

        for (int key : rooms.get(room)) {
            if (!visited[key]) {
                visited[key] = true;
                visitRoom(rooms, key, visited);
            }
        }
    }
}
