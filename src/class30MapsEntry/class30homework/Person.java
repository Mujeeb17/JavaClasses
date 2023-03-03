package class30MapsEntry.class30homework;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/*
2) Create a Person class with following private fields: name, lastName, age, salary.
Variables should be initialized through constructor.
Inside the class also create a method to print user details.
In Test Class create a Map that will store key in ascending order.
In that map store personId and a Person Object. Print each object details.
 */
public class Person {

    private String name, lastname;
    private int age, salary;

    Person(String name, String lastname, int age, int salary){
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.salary = salary;
    }

    void printDetails(){
        System.out.println("Name: " + name + " " + lastname);
        System.out.println("Age: " + age);
        System.out.println("Salary: $" + salary);
    }
}

class PersonTester {
    public static void main(String[] args) {

        Map<Integer, Person> person = new HashMap<>();

        person.put(1073289, new Person("Bob", "Brown", 80, 1000000));
        person.put(1056492, new Person("Joe", "Grey", 20, 200000));
        person.put(1087092, new Person("Joey", "Green", 25, 300000));

        Collection<Person> values = person.values();

        for (Person x: values){
            x.printDetails();
            System.out.println();
        }
    }
}