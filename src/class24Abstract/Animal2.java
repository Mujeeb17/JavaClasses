package class24Abstract;

public abstract class Animal2 {

    //using abstract keyword, we don't need to make a useless statement like
    //"animal is speaking" we can just do the following (we don't need to make an implementation of the method in parent class
     abstract void speak();
     abstract void eat();

    //but if you use abstract keyword, the child classes are now forced
    //to make their own implementations of the abstract methods
}

class Dog2 extends Animal2{

    @Override
    void speak() {
        System.out.println("BARKY BARK");
    }

    @Override
    void eat() {
        System.out.println("Dog is eating.");
    }
}