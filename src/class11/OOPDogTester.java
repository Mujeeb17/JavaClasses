package class11;

//Scanner is present in a package called util. and util is present in a package called java
import java.util.Scanner;

public class OOPDogTester {
    //main method is like the starting point telling java
    //where it should start the program, like the main door to a house
    public static void main(String[] args) {

        //this syntax is creating an actual object form the class: Scanner
        Scanner input = new Scanner(System.in);

        //now we will do the same thing with the Dog class
        //always use 'new' keyword
        //This is how we create the objects of a class
        //the same way we create the variable 'input' for Scanner, we are creating jacky from the OOPDog

        OOPDog jacky = new OOPDog();

        //we don't need to import the OOPDog class like we do with the Scanner class because
        //both this class and the OOPDog class is in the same package: class11

        //now using the variable we created: jacky, we are calling the bark & sleep method from the OOPDog class
        jacky.bark();
        jacky.sleep();

    }
}
