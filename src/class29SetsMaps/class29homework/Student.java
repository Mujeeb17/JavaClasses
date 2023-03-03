package class29SetsMaps.class29homework;

import java.util.HashSet;

/*
Create a Set collection that will hold Objects of Student Type.
In this set we do not care about the insertion order. Each student
object should have name and studentID. Display name of each student.
 */
public class Student {
    String name;
    int sID;

    public Student(String name, int sID) {
        this.name = name;
        this.sID = sID;
    }

    public static void main(String[] args) {

        HashSet<Student> s = new HashSet<>();
        // Set<Students> s = new HashSet<>(); is better because it's easier to
        // achieve polymorphism this way.

        s.add(new Student("Jack", 12345));
        s.add(new Student("John", 98765));
        s.add(new Student("Johnny", 13579));

        for(Student x: s){
            System.out.println(x.name);
        }
    }
}
