package class29SetsMaps;

import java.util.ArrayList;

public class Dog {

    String name, breed;
    int age;

    public Dog(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }
    void printName(){
        System.out.println(name);
    }
}

class ArrayListDemo {
    public static void main(String[] args) {

//        Dog d = new Dog("Bob", "Persian", 6);

        ArrayList<Dog> dogs = new ArrayList<>();

        dogs.add(new Dog("Bob", "Persian", 6));
        dogs.add(new Dog("John", "American", 8));
        dogs.add(new Dog("Doge", "French", 7));

        for(Dog x: dogs){
            x.printName();
        }

    }
}