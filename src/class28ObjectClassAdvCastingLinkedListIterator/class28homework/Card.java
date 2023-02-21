package class28ObjectClassAdvCastingLinkedListIterator.class28homework;

import java.util.Iterator;
import java.util.LinkedList;

/*
Create a Card class that will have interest rate field and card type
and a constructor that will initialize the fields.
Create 3 objects of different card and store them into LinkedList.
Using for loop/advanced for loop/ iterator access all methods of the class.
 */
public class Card {

    double interestRate;
    String cardType;

    Card(double interestRate, String cardType){
        this.interestRate = interestRate;
        this.cardType = cardType;
    }

    void displayInfo(){
        System.out.println("Your interest rate is: " + interestRate + "\nYour card type is: " + cardType);
        System.out.println();
    }

    public static void main(String[] args) {

        LinkedList<Card> c = new LinkedList<>();

        c.add(new Card(5, "Beginner"));
        c.add(new Card(3, "Intermediate"));
        c.add(new Card(2, "Loyalty"));

        //using for each loop
        for(Card x: c){
            x.displayInfo();
        }

        //practicing using iterators and loops for same task
        for(Iterator<Card> i = c.iterator(); i.hasNext();){
            Card x = i.next();
            x.displayInfo();
        }
    }
}
