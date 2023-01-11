package class2;

public class StringAddition {
    public static void main(String[] args) {

        String firstName = "George";
        String lastName = "Michael";

        String fullName = firstName + " " + lastName;

        //these 2 lines do the exact same thing
        System.out.println(fullName);
        System.out.println(firstName + " " + lastName);
    }
}
