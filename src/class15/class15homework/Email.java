package class15.class15homework;

import java.util.Scanner;

public class Email {

    //Create a method createEmail(). Based on values of users name,
    //lastName and email type, your method should return complete
    //email Address. Example:  createEmail(John, Snow, gmail) → johnsnow@gmail.com or

    Scanner input = new Scanner(System.in);
    String createEmail(){
        System.out.println("please enter your first name");
        String fName = input.nextLine();
        System.out.println("please enter your last name");
        String lName = input.nextLine();
        System.out.println("please enter email type");
        String mail = input.nextLine();
        return fName + lName + "@" + mail + ".com";
    }
}
