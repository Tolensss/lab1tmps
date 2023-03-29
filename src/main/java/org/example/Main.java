package org.example;

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.start();
        car.accelerate();
        car.stop();

        Vehicle truck = new Truck();
        truck.start();
        truck.accelerate();
        truck.stop();

        Vehicle motorcycle = new Motorcycle();
        motorcycle.start();
        motorcycle.accelerate();
        motorcycle.stop();
    }

}
