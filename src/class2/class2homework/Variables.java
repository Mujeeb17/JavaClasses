package class2.class2homework;

/*
 TASK 3: Create a Java program and name it Variables In your program create different type of
 variables to store student’s information and then print value of those variables:
name, lastName, grade, city, state, phoneNumber
b) change city, state, phone number, & grade. print updated values
 */
public class Variables {
    public static void main(String[] args) {

        //variables storing student's info
        String name = "Joe";
        String lastName = "Smith";
        int grade = 75;
        String city = "Toronto";
        String state = "Ontario";
        String phoneNumber = "(289)-639-6704";

        //printing students info
        System.out.println(name);
        System.out.println(lastName);
        System.out.println(grade);
        System.out.println(city);
        System.out.println(state);
        System.out.println(phoneNumber);

        //updating student's info
        city = "San Francisco";
        state = "California";
        phoneNumber = "(123)-345-8456";
        grade = 95;

        //printing updated values
        System.out.println("\nupdated student info:");
        System.out.println(city);
        System.out.println(state);
        System.out.println(phoneNumber);
        System.out.println(grade);

    }//end of main method
}//end of class
