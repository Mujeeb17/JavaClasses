package class20InheritanceSuper;

public class Child1 extends ParentInheritance {
    //showing how access modifiers affect subclasses
    public static void main(String[] args) {

        Child1 c1 = new Child1();

        c1.hello();
        ParentInheritance.bye(); // static methods should be executed using the class name (not object)
       // c1.money(); // 'money' has private access modifier so = error

        c1.name = "Joe"; // default variable so we have to use object
        ParentInheritance.lastName = "Brown"; // static variable so we use class name
    }

}
