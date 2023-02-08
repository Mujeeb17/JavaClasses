package class21;

public class Animal {
    String name;
    String color="Black";

}

class Cat extends Animal{
    String color="white";
    int age=10;
    double weight;

    void printColor(){
        System.out.println(super.color);
    }

}
class AnimalTester{
    public static void main(String[] args) {

        Cat cat=new Cat();

        //not that we CANNOT access the color: Black in this class because it is only gonna be
        //available in the child class
        System.out.println(cat.color);
        //so if we want to access the 'color' from the parent class, we can use the method

        cat.printColor();

    }
}
