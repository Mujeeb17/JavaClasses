package class22MethodOverriding;

public class Employee {

    String name;
    static int baseSalary = 30000;
    static int baseHolidays = 10;

    void printS(){
        System.out.println(baseSalary);
    }
    void printH(){
        System.out.println(baseHolidays);
    }
}

class OfficeBoy extends Employee {

}

class Manager extends Employee {

    @Override
     void printS(){
        System.out.println(baseSalary*4 + 200000);
    }
}