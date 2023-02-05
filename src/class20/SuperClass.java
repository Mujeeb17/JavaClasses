package class20;

public class SuperClass {

    SuperClass(){
        System.out.println("I am a constructor from the parent class");
    }
}

class SubClass extends SuperClass {

    SubClass(){
        super(); // makes a call to the parent class constructor
                    // super keyword only works through inheritance (if you remove 'extends SuperClass'
                    // it won't work anymore. but if you remove super() while keeping 'extends SuperClass'
                    //it will still work

        //from a child class C
        System.out.println("I am child constructor from subclass");
    }

}