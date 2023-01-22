package class12;

public class StringDemo8 {
    public static void main(String[] args) {

        String str = "Java is love";

        //the charAt() method will return a specific letter based on the index you
        //inputted in the brackets for the input of charAt()
        char c =str.charAt(0);
        System.out.println(c);

        //this loop is printing each individual character that's inside the String: "str"
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
        
        //this will check the amount of times the letter 'a' appears in the string
        int amt= 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ('a')){
                amt++;
            }
        }
        System.out.println(amt);
    }
}
