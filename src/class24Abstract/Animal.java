package class24Abstract;

/*
define speak, eat methods
make 3 subclasses and override the methods
 */
public class Animal {

    //these methods in the parent class are never going to be used but they are
    //needed for polymorphism so we have to define them in the parent class
    //solution to this: go to class Animal2
    void speak() {
        System.out.println("Animal is speaking");
    }

    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    @Override
    void speak() {
        System.out.println("BARK BARK");
    }

    @Override
    void eat() {
        System.out.println("Dog is eating");
    }
}

class Cat extends Animal {
    @Override
    void speak() {
        System.out.println("meow meow");
    }

    @Override
    void eat() {
        System.out.println("Cat is eating");
    }
}

class Horse extends Animal {
    @Override
    void speak() {
        System.out.println("NAYYYY");
    }

    @Override
    void eat() {
        System.out.println("Horse is eating");
    }
}