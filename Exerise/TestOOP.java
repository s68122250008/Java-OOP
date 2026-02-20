package Exerise;

abstract class Vehicle {
    String name;

    public Vehicle(String name) {
        this.name = name;
    }

    abstract void move();

    void info() {
        System.out.println("Vehicle: " + name);
    }

    abstract void refuel();


}

interface Fuel {
    void refuel();
}

class Car extends Vehicle implements Fuel {

    public Car(String name) {
        super(name);
    }

    @Override
    void move() {
        System.out.println(name + " is driving");
    }

    @Override
    public void refuel() {
        System.out.println(name + " is refueling");
    }
}

public class TestOOP {
    public static void main(String[] args) {
        Vehicle v = new Car("Honda");

        v.move();
        v.info();

        v.refuel();  // (A)
    }
}