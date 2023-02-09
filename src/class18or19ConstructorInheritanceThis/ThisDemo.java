package class18or19ConstructorInheritanceThis;

public class ThisDemo {

    String name;
    int age;

    ThisDemo(String name, int age){

        //the this keyword is referring to the instance variable version of 'name' and 'age'
        //the right side of equation is the local variable / the parameter
        this.name = name;
        this.age = age;
    }

    void print(){
        System.out.println(name + " is " + age + " years old");
    }

    public static void main(String[] args) {

        new ThisDemo("Joe", 8).print();
    }
}
