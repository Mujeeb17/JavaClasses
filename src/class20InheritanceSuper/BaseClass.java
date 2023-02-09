package class20InheritanceSuper;

//practicing other usages of super (variables and methods)

public class BaseClass {

    String name = "John";

    void hello(){
        System.out.println("Hello method from base class");
    }
}

class ChildClass extends BaseClass{

    //what if the subclass had the same variable name as super class?
    String name = "Jane";

    void callMe(){

        System.out.println(this.name); // calls the name variable from CURRENT CLASS
                                        // (it's there by default even if we don't type 'this')

        System.out.println(super.name); // calls the name variable from SUPER CLASS
    }

    void callingParentMethod(){
        super.hello(); // calling a method from SUPER CLASS
    }
}

class TestingSuperKeyword {

    public static void main(String[] args) {

        ChildClass c = new ChildClass();

        c.callingParentMethod();
        System.out.println();
        c.callMe();
    }
}