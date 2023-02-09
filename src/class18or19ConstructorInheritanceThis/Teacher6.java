package class18or19ConstructorInheritanceThis;

public class Teacher6 {

    String name, subject;
    int id;

    Teacher6(String name, int id){
        this.name = name;
        this.id = id;
    }
    Teacher6(String name, int id, String subject){
        this(name, id); // calling the previous constructor so we can reuse the code
        this.subject = subject;
    }


}
