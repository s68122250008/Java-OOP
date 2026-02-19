package Exerise;
// ! Abstract , Composition , Polymorphism

// Composition
class Collar {
    String color;

    // Constructor
    public Collar(String color) {
        this.color = color;
    }

}

// Parent Class
abstract class Pet {
    String name;
    Collar collar;

    // Constructor
    public Pet(String name, Collar color) {
        this.name = name;
        this.collar = color;
    }

    // Abstract Method
    abstract void makeNoise();

    void eat() {
        System.out.println("The Animal is eatting...");
    }

    void displayInfo() {
        System.out.println(name + " has a " + collar.color + " collar.");
    }

}

// Sub Class
class Dog extends Pet {

    public Dog(String name, Collar color) {
        super(name, color);
    }

    @Override
    void makeNoise() {
        System.out.println("Hong Hong");
    }
}

// Sub Class
class Cat extends Pet {

    public Cat(String name, Collar color) {
        super(name, color);
    }

    @Override
    void makeNoise() {
        System.out.println("Meow Meow");
    }
}

// Main
public class Animal {
    public static void main(String[] args) {
        Collar redCollar = new Collar("Red");
        Collar greenCollar = new Collar("Green");
        // Obj Array(Polymorphism)
        Pet[] myPet = {
                new Dog("Mike", greenCollar),
                new Cat("Peet", redCollar),

        };
        // .map()
        for (Pet item : myPet) {
            item.displayInfo();
            item.eat();
            item.makeNoise();
        }
    }
}
