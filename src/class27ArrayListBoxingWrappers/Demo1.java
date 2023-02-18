package class27ArrayListBoxingWrappers;

public class Demo1 {
    public static void main(String[] args) {

        //normal way of storing a name for us
        String name = "Joe";
        String name2 = "hoe";

        //what if I need to store more than 1 name?
        String[] names = {"Bob", "John", "Abby"};

        displayNames(names);
        System.out.println();
        showNames(name, name2);
    }

    //create method that prints names from array
    public static void displayNames(String[] names){
        for (String n: names){
            System.out.println(n);
        }
    }
    //create method that prints the individual names
    public static void showNames(String n1, String n2){
        System.out.println(n1 + "\n" + n2);
    }
    //create method

}
