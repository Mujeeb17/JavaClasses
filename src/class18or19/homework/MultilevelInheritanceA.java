package class18or19.homework;
/*
HW: Write program for multilevel inheritance where class C inherits from class B and Class B inherits from Class A.

&

Write program to inherit class A that has method printF which is static and call or reuse that method into class B
 */

//this class only has acess to classA
public class MultilevelInheritanceA {
    String classA = "classA";

    static void printF() {
        System.out.println("F");
    }
}

//this class only has access to classA and classB
class MultilevelInheritanceB extends MultilevelInheritanceA {
    String classB = "classB";

    public static void main(String[] args) {
        MultilevelInheritanceA.printF(); // could also work with just 'printF()'
    }
}

//this class has access to all variables
class MultilevelInheritanceC extends MultilevelInheritanceB {
    String classC = "classC";
}