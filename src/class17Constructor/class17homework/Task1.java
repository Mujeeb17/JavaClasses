package class17Constructor.class17homework;
/*
1) Write a java class that will have a constructor: one with parameters and second
without any parameters. Create a separate Test class where you will execute
both of the constructors 1 by 1.

 */
public class Task1 {

    String p1;
    int p2;

    Task1(String par1, int par2){
        p1 = par1;
        p2 = par2;
    }
    Task1(){
        //no parameters
    }

    void printInfo(){
        System.out.println(p1 + " " + p2);
    }
}
