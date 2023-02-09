package class4IfElse.class4homework;
/*
TASK 2: Create a Java program and store values of mortgage rate and mortgage price.
First, program should check if rate is higher than 4.5 user will not buy a house,
otherwise user will consider buying. Once user decides to buy a house, if price of
the house is larger than 200000 than user will take a loan, otherwise user will pay cash.
 */
public class Mortgage {
    public static void main(String[] args) {

        double mRate = 4.2;
        double mPrice = 300000;

        if (mRate <= 4.5) {
            System.out.println("Consider buying a house");
            if (mPrice > 200000) {
                System.out.println("you should take a loan");
            } else {
                System.out.println("you should pay cash");
            }
        } else {
            System.out.println("don't buy a house");
        }

    }
}
