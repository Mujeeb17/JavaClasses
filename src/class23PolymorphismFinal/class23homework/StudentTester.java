package class23PolymorphismFinal.class23homework;
/*
Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent.
Define common behavior within parent class and override some of the methods in child classes
Define some methods specific to child classes
Write example of achieving run time polymorphism
 */
public class StudentTester {
    public static void main(String[] args) {

        //run time polymorphism is achieved through overriding methods
        Student[] s = {new SyntaxStudent(), new CollegeStudent(), new SchoolStudent()};

        //printing all methods specific to its subclass
        for (Student x: s){
            x.greet();
            x.location();
        }
    }
}
