package com.algorithm.leetcode.algorithm;

public class ParkingSystem {

    private int big;
    private int medium;
    private int small;

    public static void main(String[] args) {
        ParkingSystem parkingSystem = new ParkingSystem(1, 1, 0);
        boolean car1 = parkingSystem.addCar(1);
        boolean car2 = parkingSystem.addCar(2);
        boolean car3 = parkingSystem.addCar(3);
        boolean car4 = parkingSystem.addCar(1);
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
    }

    public ParkingSystem(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }

    public boolean addCar(int carType) {
        if (carType == 1 && big > 0) {
            big--;
            return true;
        }
        if (carType == 2 && medium > 0) {
            medium--;
            return true;
        }
        if (carType == 3 && small > 0) {
            small--;
            return true;
        }
        return false;
    }
}
