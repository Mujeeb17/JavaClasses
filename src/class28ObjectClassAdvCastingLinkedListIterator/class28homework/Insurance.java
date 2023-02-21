package class28ObjectClassAdvCastingLinkedListIterator.class28homework;

import java.util.ArrayList;
import java.util.Iterator;

/*
6) Create a class Insurance that will have an attribute as insuranceName
and unimplemented behaviour as getQuote and cancelInsurance. Create 3 subclasses
Car, Pet, Health. Car class has it’s own attribute as carModel and Class Pet has
petType attribute. Create 3 objects of the sub classes and store them in ArrayList.
Using for loop/advanced for loop/ iterator access all methods of the class.
 */
public abstract class Insurance {

    String insuranceName;

    abstract void getQuote();
    abstract void cancelInsurance();

}

class Car extends Insurance {
    String carModel;
    @Override
    void getQuote() {
        System.out.println("getting quote for car insurance");
    }

    @Override
    void cancelInsurance() {
        System.out.println("cancelling car insurance");
    }
}

class Pet extends Insurance {
    String petType;
    @Override
    void getQuote() {
        System.out.println("getting quote for cat insurance");
    }

    @Override
    void cancelInsurance() {
        System.out.println("cancelling cat insurance");
    }
}

class Health extends Insurance {
    @Override
    void getQuote() {
        System.out.println("getting quote for health insurance");
    }

    @Override
    void cancelInsurance() {
        System.out.println("cancelling health insurance");
    }
}
// Create 3 objects of the sub classes and store them in ArrayList.
// Using for loop/advanced for loop/ iterator access all methods of the class.
class InsuranceTester {
    public static void main(String[] args) {

        ArrayList<Insurance> obj = new ArrayList<>();

        obj.add(new Car());
        obj.add(new Pet());
        obj.add(new Health());

        for(Iterator<Insurance> i = obj.iterator(); i.hasNext();){
            Insurance o = i.next();
            o.getQuote();
            o.cancelInsurance();
        }
    }
}