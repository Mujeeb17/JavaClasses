package class27ArrayListBoxingWrappers;

public class Demo2 {
    public static void main(String[] args) {

        String[] names = {"Bob", "John", "Abby"};

        System.out.println(hasName(names, "Abby"));
    }

    //create a method that checks if a String is present in an array
    // if it is, return true, else, return false
    public static boolean hasName(String[] names, String name){
        for (String x: names) {
            if (x.equals(name)){
                return true;
        }
    }
        return false;
    }
}
