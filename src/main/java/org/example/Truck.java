package org.example;

public class Truck implements Vehicle {
    public void start() {
        System.out.println("Truck started.");
    }

    public void accelerate() {
        System.out.println("Truck accelerated.");
    }

    public void stop() {
        System.out.println("Truck stopped.");
    }
}