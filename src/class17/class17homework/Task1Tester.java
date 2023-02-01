package class17.class17homework;
/*
1) Write a java class that will have a constructor: one with parameters and
second without any parameters. Create a separate Test class where you will
execute both of the constructors 1 by 1.

 */
public class Task1Tester {
    public static void main(String[] args) {

        Task1 const1 = new Task1("Parameter 1", 2);
        Task1 const2 = new Task1();

        const1.printInfo();
        const2.printInfo();
    }
}
