package class12StringClass.class12homework;

import java.util.Scanner;

/*
Store username, password and confirm password from a user and check following requirements:

Username and Password cannot be  empty, if so→ message= ”Username and Password cannot be empty”.
Password should be minimum 8 characters, if less → message= ”Password is too short”.
Password cannot contain username if so, → message= ”Password cannot contain username”.
Password should match confirmed password, if not  → message=“Passwords do not match”.

Only after all requirements met → message “Your username and password has been created”
 */
public class Login {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int i;
        do {
            i = 1;

            System.out.println("Input username");
            String un = input.nextLine();

            System.out.println("Input password");
            String pw = input.nextLine();

            System.out.println("Confirm password");
            String cpw = input.nextLine();

            if (un.isEmpty() || pw.isEmpty()) {
                System.out.println("Username and Password cannot be empty");
                i++;
            }
            if (pw.length() < 8) {
                System.out.println("Password is too short");
                i++;
            }
            if (pw.contains(un)) {
                System.out.println("Password cannot contain username");
                i++;
            }
            if (!pw.equals(cpw)) {
                System.out.println("Passwords do not match");
                i++;
            }
        } while (i > 1);

        System.out.println("Your username and password has been created");
    }
}
