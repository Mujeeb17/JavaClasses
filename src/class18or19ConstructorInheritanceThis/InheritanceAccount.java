package class18or19ConstructorInheritanceThis;

public class InheritanceAccount { // parent class or super class or base class

    long accountNumber;
    double money;

    void deposit(){
        System.out.println("Deposit method from account class");
    }
}

// 'extends' allows us to acquire the methods and variables from the parent class

class Checking extends InheritanceAccount{ // child class or sub class or derived class

    double interest;
    void transfer(){
        System.out.println("transfer methods from checking class");
    }
}

class Savings extends InheritanceAccount { // another subclass. this makes this type of inheritance: hierarchical

    double profit;
    void takeProfit(){
        System.out.println("Profit methods from savings class");
    }
}

class SuperSavings extends Savings{ // this is type multilevel inheritance
                                    // it is a sub-sub class of Savings which is sub class to Account

    void superSavings(){
        System.out.println("Super savings methods from SuperSavings class");
    }

}