package org.example;

public class Motorcycle implements Vehicle {
    public void start() {
        System.out.println("Motorcycle started.");
    }

    public void accelerate() {
        System.out.println("Motorcycle accelerated.");
    }

    public void stop() {
        System.out.println("Motorcycle stopped.");
    }
}