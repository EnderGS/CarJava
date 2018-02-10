package com.caedin.challenges.inheritance;

import java.util.Scanner;

public class Vehicle {
    private String name;
    private String size;


    private int currentSpeed;
    private int currentDirection;

    Scanner scanner = new Scanner(System.in);

    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;


        this.currentSpeed = 0;
        this.currentDirection = 0;
    }

    public void steer() {
        System.out.println("How far would you like to turn in degrees?");
        int direction = scanner.nextInt();
        this.currentDirection += direction;

    }
    public void move(int speed) {
        this.currentSpeed = speed;

        System.out.println("Vehicle moving at " + currentSpeed + " in direction " + currentDirection + "\u00b0");
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

}
