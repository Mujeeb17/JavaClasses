package class4;

//must import scanner class to use it

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {

        //This statement is needed when you want to allow
        //user input in your program
        Scanner input = new Scanner(System.in);

        //Scanner is just like a variable and we named it 'input'
        //(System.in) is telling computer we want to read data from
        //keyboard instead of a file

        //System.out means show something on console
        //System.in means get something from console

        System.out.println("please enter you name");

        //we declared a variable (name) and then allowed the user to
        //enter their name as the variables value
        String name = input.nextLine();

        //we use 'input.next' only when the input is expected to be one word
        // 'nextLine' allows user to input sentences/paragraphs (allows spaces)

        //printing out the input the user gave previously
        System.out.println("your name is " + name);

        System.out.println("please enter your gender");

        //using 'charAt(0)' tells computer to only use the first letter that is inputted
        //in the console
        char gender = input.next().charAt(0);
        System.out.println("Gender is " + gender);

        //good practice to do this at the end of a program so
        //that you can save space because Scanner is an
        // 'expensive resource'
        input.close();
    }
}
