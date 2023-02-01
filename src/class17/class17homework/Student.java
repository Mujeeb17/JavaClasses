package class17.class17homework;
/*
2)Write a java Class Students that have a constructor which takes
students name and 3 subject grades. Inside your class also have a
method to Calculate Average Grade. Test Student class for 5 different
students with different marks. Your program should print an average
 mark of each students name.

 */
public class Student {
    String name;
    double g1, g2, g3;

    Student(String n, double gr1, double gr2, double gr3){
        name = n;
        g1 = gr1;
        g2 = gr2;
        g3 = gr3;
    }

    void printAvg(){
        System.out.println(name + " avg = " + (g1 + g2 + g3) / 3);
    }

    public static void main(String[] args) {

        Student s1 =  new Student("Joe", 78,43,68);
        Student s2 =  new Student("Joey", 67,82,75);
        Student s3 =  new Student("Johnny", 96,78,89);
        Student s4 =  new Student("Jack", 24,43,62);
        Student s5 =  new Student("Jacky", 99,100,86);

        s1.printAvg();
        s2.printAvg();
        s3.printAvg();
        s4.printAvg();
        s5.printAvg();
    }
}
