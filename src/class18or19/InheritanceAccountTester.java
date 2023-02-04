package class18or19;

public class InheritanceAccountTester {
    public static void main(String[] args) {

        InheritanceAccount ba = new InheritanceAccount();
        ba.accountNumber = 8362980438l;
        ba.money = 1000;
        ba.deposit();

        System.out.println(ba.accountNumber);
        System.out.println(ba.money);

        Checking ca = new Checking();

        //these are variables from Account class
        ca.accountNumber = 316873129;
        ca.money = 170;

        //this is a variable from the actual checking class
        ca.interest = 2;

        ca.deposit(); // from parent class
        ca.transfer(); // from sub class

        Savings sa = new Savings();

        //from parent class
        sa.accountNumber = 65894302987l;
        sa.money =3687;

        //from sub class
        sa.profit = 9876;

        sa.deposit(); // from parent class
        sa.takeProfit(); //from sub class
    }
}
