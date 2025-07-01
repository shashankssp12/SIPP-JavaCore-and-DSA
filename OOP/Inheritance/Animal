
// Superclass
class Animal {
    String name;
    int age;

    // Constructor
    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to be overridden
    void makeSound() {
        System.out.println("Animals can sound");
    }

    // Display animal info
    void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

// Subclass: Dog
class Dog extends Animal {

    Dog(String name, int age) {
        super(name, age);
    }

    // Overriding makeSound
    @Override
    void makeSound() {
        System.out.println("Dogs do Bhow! Bhow!");
    }
}

// Subclass: Cat
class Cat extends Animal {

    Cat(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println("Cats do Meow! Meow!");
    }
}

// Subclass: Bird
class Bird extends Animal {

    Bird(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println("Birds do cheew! cheew!");
    }
}

// Main class to test
public class AnimalTest {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", 3);
        Cat cat = new Cat("Twinky", 2);
        Bird bird = new Bird("Coco", 1);

        dog.displayInfo();
        dog.makeSound();

        cat.displayInfo();
        cat.makeSound();

        bird.displayInfo();
        bird.makeSound();
    }
}