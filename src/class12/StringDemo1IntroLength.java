package class12;

public class StringDemo1IntroLength {
    public static void main(String[] args) {

        /*
        String class is one of the most important classes in java
        we have been using some of its methods do far like '.equals' or 'toLowerCase' but,
        it has so many more capabilities
         */

        //creating an object from the String class
        String strObj = new String("Java");

        //Java devs knew ppl would be using this String class a lot so they made a shortcut:
        String strObj2 = "Java";
        //(Normal way we've been creating Strings)

        //the 'length' method in String will return the amount of characters
        //present in the String
        System.out.println(strObj.length()); // will print 4

        String st = "Banana ";

        //we are storing the length of the String 'st' in another int variable
        int length = st.length();
        System.out.println(length); // will print 7

        //example of 'length' method use
        String name = "BOBBYYYYYYYYYYY";
        if(name.length() > 10){
            System.out.println("Name can't have more than 10 characters");
        }


    }
}
