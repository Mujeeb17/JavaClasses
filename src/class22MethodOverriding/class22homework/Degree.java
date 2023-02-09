package class22MethodOverriding.class22homework;
/*
Create a class Degree having a method getPrerequisite
Create 2 subclasses Bachelors and Masters
Override the getPrerequisite method in Masters class
Print the method using an object from each class
 */
public class Degree {

    void getPrerequisite(){
        System.out.println("To get a degree you need high school diploma");
    }
}

class Bachelors extends Degree {

}

class Masters extends  Degree {

    @Override
    void getPrerequisite(){
        System.out.println("To get Masters you need a bachelors degree");
    }
}

class DegreeTester {
    public static void main(String[] args) {

        Degree d = new Degree();
        Bachelors b = new Bachelors();
        Masters m = new Masters();

        d.getPrerequisite();
        b.getPrerequisite();
        m.getPrerequisite();
    }
}