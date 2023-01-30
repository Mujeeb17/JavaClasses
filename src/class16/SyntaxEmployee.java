package class16;
/*
Create a class called SyntaxEmployee:
Create 3 variables empID, salary, CEO = "Sumair"
Create 2 objects of the class
Set the value of eID, salary for each of the objects
print the eID, salary, and CEO for each object
 */
public class SyntaxEmployee {

    //since these 2 variables will differ between employees,
    //they will be created as instance variables
    String eID;
    int salary;

    static String CEO = "Sumair"; // because this variable will stay the same, we use static

    public static void main(String[] args) {
        {

            SyntaxEmployee Sumair = new SyntaxEmployee();

            Sumair.eID = "1006968";
            Sumair.salary = 10000000;

            System.out.println(SyntaxEmployee.CEO);
            System.out.println(Sumair.eID);
            System.out.println(Sumair.salary);

            SyntaxEmployee Asel = new SyntaxEmployee();

            Asel.eID = "1003458";
            Asel.salary = 200000000;

            System.out.println(SyntaxEmployee.CEO);
            System.out.println(Asel.eID);
            System.out.println(Asel.salary);
        }
    }
}
