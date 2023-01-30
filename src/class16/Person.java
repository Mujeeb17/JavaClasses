package class16;

public class Person {

    //this variable should only be shared within this class (private), nowhere else
    private double bankBalance = 1250000;

    //this is default access because we aren't using any keywords
    //we can use this variable in all classes that are in the same package
    String address = "street 123";

    //this variable is public can be freely used with all classes
    //inside the same project
    public String name = "John Joe";

    public static void main(String[] args) {

        Person John = new Person();
        System.out.println(John.bankBalance);
        System.out.println(John.address);
        System.out.println(John.name);
    }
}
