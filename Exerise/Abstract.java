package Exerise;

// Abstract , Polymorphism
abstract class Animal {
    String name; // instance

    public Animal(String name) { // Constructor
        this.name = name;
    }

    abstract void makeSound(); // Method บังคับจาก Abstact สร้าง Body Fn ไม่ได้

    void sleeping() {
        System.out.println("Animal is sleeping");
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name); // ส่งข้อมูลไปคลาสแม่
    }

    @Override
    void makeSound() {
        System.out.println(name + " Say: " + "Hong");
    }
}

class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println(name + " Say: " + "Meow");
    }
}

public class Abstract {

    public static void main(String[] args) {
        // Polymorphism
        Animal d1 = new Dog("Mike");
        Animal c1 = new Cat("Kan");

        d1.makeSound();
        d1.sleeping();
        c1.makeSound();
        c1.sleeping();
        // Polymorphism

        // Polymorphism แบบ Array
        Animal[] animals = {
                new Dog("Mike"),
                new Cat("Kan"),
        };

        // วนตามจำนวนใน animals
        for (Animal a : animals) {
            a.makeSound();
        }

    }
}
