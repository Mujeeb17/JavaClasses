package class17;

/*
Create a class called Student, define 4 instance fields: id, name, age, weight
create 5 objects of this class
 */
public class StudentConstructor {

    //creating instance variables
    String id, name;
    int age;
    double weight;

    //creating the constructor outside of main method
    StudentConstructor(String sID, String sName, int sAge, double sWeight) {
        id = sID;
        name = sName;
        age = sAge;
        weight = sWeight;
    }

    //Example from notes of using 2 constructors
    StudentConstructor(String sID, int sAge) {
        id = sID;
        age = sAge;
    }

    //creating a method that will print all the students information
    //also making the method work for both conditions using if statement
    void printInfo() {
        if (weight == 0) {
            System.out.println("Id = " + id + ", age = " + age);
        } else {
            System.out.println("Id = " + id + ", name = " + name + ", age = " + age + ", weight = " + weight);
        }
    }

    public static void main(String[] args) {

        //creating the objects inside the main method using the constructor
        StudentConstructor s1 = new StudentConstructor("s100123", "Joe", 21, 140.1);
        StudentConstructor s2 = new StudentConstructor("s100124", "Bob", 20, 150.3);
        StudentConstructor s3 = new StudentConstructor("s100125", "Joey", 24, 164.6);
        StudentConstructor s4 = new StudentConstructor("s100126", "Johnny", 23, 180.3);
        StudentConstructor s5 = new StudentConstructor("s100127", "John", 27, 175.6);

        //using 2nd constructor
        StudentConstructor s6 = new StudentConstructor("s100128", 25);

        //using the method to print out the students information
        s1.printInfo();
        s2.printInfo();
        s3.printInfo();
        s4.printInfo();
        s5.printInfo();
        s6.printInfo();
    }

}
