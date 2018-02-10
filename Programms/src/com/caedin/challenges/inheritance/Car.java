package com.caedin.challenges.inheritance;

import java.util.Scanner;

public class Car extends Vehicle {
    private int doors;
    private int gears;
    Scanner scanner = new Scanner(System.in);

    public Car(String name, String size, int doors, int gears) {
        super(name, size);
        this.doors = doors;
        this.gears = gears;
    }

    public void getCarDescription() {
        System.out.println("Car is in gear " + getGears());
        System.out.println("Car has "+ getDoors() + " doors.");
    }


    @Override
    public void move(int speed) {
        shiftGear();
        if(gears == 0) {
            System.out.println("You must be at least in gear 1");
        }
        if(gears == 1) {
            speed = 10;
        }
        if(gears == 2) {
            speed = 20;
        }

        super.move(speed);
    }

    private void shiftGear() {
        System.out.println("To go up a gear say up and down to go down");
        String gearLevel = scanner.nextLine();

        if(gearLevel.equalsIgnoreCase("up")) {
            if(gears <= 2) {
                gears++;
            }else {
                System.out.println("You have reached the max gear!");
            }
        }
        if(gearLevel.equalsIgnoreCase("down")) {
            if(gears > 0) {
                gears--;
            }else {
                System.out.println("You are already on the lowest gear!");
        }
        }

    }

    public int getDoors() {
        return doors;
    }

    public int getGears() {
        return gears;
    }
}
