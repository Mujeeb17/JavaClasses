package class11OOP.class11homework;
/*
2) Create a Dog Class and create 3 different objects of it:
Husky, Bulldog, Labrador with specific  attributes and behaviors.
*/
public class DogTester {
    public static void main(String[] args) {

        Dog Husky = new Dog();

        Husky.name="Bob";
        Husky.breed="Domestic";
        Husky.age=3;

        Husky.bark();

        Dog Bulldog = new Dog();

        Bulldog.name="Joe";
        Bulldog.breed="American";
        Bulldog.age=4;

        Bulldog.eat();

        Dog Labrador = new Dog();

        Labrador.name="Carl";
        Labrador.breed="French";
        Labrador.age=2;

        Labrador.sleep();
    }

}
