package class17;

public class DogConstructor {

    String name, breed;
    int age;
    double weight;

    /*
    public static void main(String[] args) {

        //Task: create 5 objects from this class

        Dog dog1 = new Dog();
        dog1.name = "Joe";
        dog1.breed = "A";
        dog1.age = 2;
        dog1.weight = 10.5;
        Dog dog2 = new Dog();
        dog2.name = "bob";
        dog2.breed = "B";
        dog2.age = 3;
        dog2.weight = 12.5;
        Dog dog3 = new Dog();
        dog3.name = "john";
        dog3.breed = "C";
        dog3.age = 4;
        dog3.weight = 9.5;
        Dog dog4 = new Dog();
        dog4.name = "johnny";
        dog4.breed = "D";
        dog4.age = 1;
        dog4.weight = 4.5;
        Dog dog5 = new Dog();
        dog5.name = "Joey";
        dog5.breed = "E";
        dog5.age = 8;
        dog5.weight = 14.5;
        */

    //instead of having to create 5 objects and 5 lines of code in each,
    //we can do this more efficiently with constructors

//    }

    //the only name constructors can have is the same name as the class
    DogConstructor(String dogName, String dogBreed, int dogAge, double dogWeight) {
        name = dogName;
        breed = dogBreed;
        age = dogAge;
        weight = dogWeight;

    }

    public static void main(String[] args) {

        //now after making the Dog constructor, we can do the same task like this:
        DogConstructor dog1 = new DogConstructor("Joe", "German", 4, 10.5);
        DogConstructor dog2 = new DogConstructor("Bob", "Bulldog", 3, 9.5);

        dog1.printInfo();
        dog2.printInfo();

        //note that you have to create the objects (from the constructor) in the main method
    }

    //creating a method that would print the info from the dog objects
    void printInfo() {
        System.out.println("name = " + name + " breed = " + breed + " age = " + age + " weight = " + weight);
    }

}
