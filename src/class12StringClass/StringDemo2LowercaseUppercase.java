package class12StringClass;

public class StringDemo2LowercaseUppercase {
    public static void main(String[] args) {

        String str = "JAVA is FUN";

        //Another method in String class is toLowerCase()
        String newStr=str.toLowerCase();
        //will convert all characters in the String to lowercase letters
        //(Not permanently so we have to store it in a new variable to make it permanent)

        System.out.println(newStr);

        //Another method is toUpperCase()
        String str2 = "i love javava";

        String newStr2 = str2.toUpperCase();

        System.out.println(newStr2);
    }
}
