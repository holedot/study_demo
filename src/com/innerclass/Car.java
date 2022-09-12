package com.innerclass;

public class Car {
    private String brand;

    public Car(String brand) {
        this.brand = brand;
    }

    class Engine {
        String model;

        public Engine(String model) {
            this.model = model;
        }

        public void ignite() {
            System.out.println("发动机" + this.model + "点火");
        }

        public void start() {
            System.out.println("启动" + this);
        }
    }

    public static void main(String[] args) {
        Car car = new Car("大众");
        Engine d = car.new Engine("d");
    }
}


