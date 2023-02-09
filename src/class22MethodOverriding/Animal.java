package class22MethodOverriding;

public class Animal {

    void speak(){
        System.out.println("Animal is speaking");
    }
}

class Cat extends Animal{

                // this '@Override' doesn't provide any function its just good practice
                // because it's easier to read for other programmers reading the code
    @Override   // it also helps the compiler help you find errors if you change anything in your programs
    void speak(){
        System.out.println("The cat is speaking");
    }
}

class Dog extends Animal {
    @Override
    void speak(){
        System.out.println("The dog is speaking");
    }
}

class AnimalTester{
    public static void main(String[] args) {

        Animal a = new Animal();
        a.speak();


    }
}