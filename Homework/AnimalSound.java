// question : Q1. ANIMAL SOUND SYSTEM

// A wildlife application needs to store information about different animals.

// All animals have a common method called eat().

// However, every animal produces a different sound.

// The system should support:
// - Dog
// - Cat
// - Cow

// Requirements:
// - Create an abstract class Animal.
// - Add a concrete method eat().
// - Add an abstract method sound().
// - Create Dog, Cat, and Cow classes.
// - Each child class should provide its own implementation of sound().
// - Create objects and display their behavior.

// Concepts expected:
// Inheritance
// Abstract Class
// Abstract Method
// Method Overriding

/abstract class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
    
    abstract void sound();
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog bark");
    }
}
class Cat extends Animal {
    void sound() {
        System.out.println("Cat meow ");
    }
}
class Cow extends Animal {
    void sound() {
        System.out.println("Cow moows");
    }
}

class AnimalSound {
    public static void main(String[] args) {
        Animal a1 = new Dog();
        a1.eat();
        a1.sound();
        
        Animal a2 = new Cat();
        a2.eat();
        a2.sound();
        
        Animal a3 = new Cow();
        a3.eat();
        a3.sound();
    }
}