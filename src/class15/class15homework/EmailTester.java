package class15.class15homework;

import java.util.Scanner;

public class EmailTester {
    public static void main(String[] args) {

        //Create a method createEmail(). Based on values of users name,
        //lastName and email type, your method should return complete
        //email Address. Example:  createEmail(John, Snow, gmail) → johnsnow@gmail.com or

        Email email = new Email();

        System.out.println(email.createEmail());

    }
}
