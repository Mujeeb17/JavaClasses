package class26Encapsulation;

public class Account {
    private double balance;
    private String accNum, accType, accTitle;

    //this method allows us to show a variable without letting
    //it be modified because its private
    public String getAccTitle() {
        return accTitle;
    }

    public void setBalance(double balance) {
        //if conditions to check what kind of values the user is sending
        //(aka "sanitizing the input")
        if (balance < 0) {
            System.out.println("negative balance is not allowed");
        } else {
            this.balance = this.balance + balance;
        }
    }

    public String getAccNum() {
        return accNum;
    }

    public void setAccNum(String accNum) {
        if (accNum.length() != 15) {
            System.out.println("wrong account number");
        } else {
            this.accNum = accNum;
        }
    }

    public Account(double balance, String accNum, String accType, String accTitle) {
        this.balance = balance;
        this.accNum = accNum;
        this.accType = accType;
        this.accTitle = accTitle;
    }

}

class AccountTester {
    public static void main(String[] args) {

        //there is a logical problem with this: the balance shouldn't be negative
        //this is solved with encapsulation
        Account a = new Account(-1000, "100123", "Debit", "Title");

        a.setBalance(-99);
        System.out.println(a.getAccTitle());
    }
}