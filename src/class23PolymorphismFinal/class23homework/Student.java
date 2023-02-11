package class23PolymorphismFinal.class23homework;
/*
Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent.
Define common behavior within parent class and override some of the methods in child classes
Define some methods specific to child classes
Write example of achieving run time polymorphism
 */
public class Student {
    public void greet(){
        System.out.println("I am student");
    }
    public void location(){
        System.out.println("I study at home");
    }
}

class SyntaxStudent extends Student {
    @Override
    public void greet() {
        System.out.println("I am a Syntax Student");
    }

    @Override
    public void location() {
        System.out.println("I study at Syntax Technologies");
    }
}

class CollegeStudent extends Student {
    @Override
    public void greet() {
        System.out.println("I am a college student");
    }

    @Override
    public void location() {
        System.out.println("I study at college");
    }
}

class SchoolStudent extends Student {
    @Override
    public void greet() {
        System.out.println("I am a school student");
    }

    @Override
    public void location() {
        System.out.println("I study at school");
    }
}