package class20InheritanceSuper.class20homework;
/*
2. Create an Employee class that will have variables and methods. Constructor that should initialize instance variables
Create 2 subclasses FullTime and PartTime Employees that should have own variables and methods.
Create a Tester Subclass from FullTime Employee and add some features and methods to the Tester Class.
Test your code!
 */
public class Employee {

    String name;
    int id;

    Employee(String name, int id){
        this.name = name;
        this.id = id;
    }
    void employeeDetails(){
        System.out.println("name: " + name + ", id: " + id);
    }
}

class FullTime extends Employee {

    double holidayPay;
    FullTime(String name, int id, double holidayPay){
        super(name, id);
        this.holidayPay = holidayPay;
    }

    void fullT(){
        System.out.println("I get paid " + holidayPay + " times on holidays");
    }

}

class PartTime extends Employee {

    int daysOff;
    PartTime(String name, int id, int daysOff){
        super(name, id);
        this.daysOff = daysOff;
    }

    void partT(){
        System.out.println("I have " + daysOff + " days off");
    }
}

class FullTimeTester {
    public static void main(String[] args) {

        FullTime ft = new FullTime("Joe", 34835697, 2);
        ft.employeeDetails();
        ft.fullT();
    }
}