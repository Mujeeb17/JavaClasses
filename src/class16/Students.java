package class16;
/*
Create a Class called Students
Create three  variables  Name , ID  and  numberOfStudents
Create three objects of the Students Class
Set the value for  studentName , studentID and increment  the numberOfStudents for each object
Print out  total number of students
 */
public class Students {

    // these 2 variables will differ between students so they are instance variables
    String name;
    String id;

    //static because we can access this with any object
    //this variable is shared with all objects
    static int numOfS;

    public static void main(String[] args) {

        Students Joe = new Students();

        Joe.name = "Joe";
        Joe.id = "S100";
        Joe.numOfS++;

        Students Bob = new Students();

        Bob.name = "Bob";
        Bob.id = "S200";
        Bob.numOfS++;

        Students John = new Students();

        John.name = "John";
        John.id = "S300";
        John.numOfS++;

        System.out.println(Students.numOfS);

        String str = "RockStar";
        System.out.println(str.endsWith("r"));
    }
}
