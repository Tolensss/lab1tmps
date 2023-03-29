package org.example;

public class Car implements Vehicle {
    public void start() {
        System.out.println("Car started.");
    }

    public void accelerate() {
        System.out.println("Car accelerated.");
    }

    public void stop() {
        System.out.println("Car stopped.");
    }
}