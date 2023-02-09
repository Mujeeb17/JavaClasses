package class20InheritanceSuper;

public class ParentInheritance {

    String name;
    static String lastName;

    public void hello(){
        System.out.println("public hello form parent class");
    }

    protected static void bye(){
        System.out.println("protected method bye from parent class");
    }

    private void money(){
        System.out.println("private method money from parent class");
    }
}
