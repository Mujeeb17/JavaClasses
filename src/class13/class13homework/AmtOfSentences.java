package class13.class13homework;
/*
3) You have a String a=”Is it saturday? Is it raining?
Do we have a Java Class today?”
How would you find out how many sentences are in that String?
 */
public class AmtOfSentences {
    public static void main(String[] args) {

        String a="Is it saturday? Is it raining? Do we have a Java Class today?";
        int count = 0;

        for (int i = 0; i < a.length(); i++) {
            if(a.charAt(i) == '?' || a.charAt(i) == '!' || a.charAt(i) == '.'){
                count++;
            }
        }
        System.out.println("Amount of sentences = " + count);

        //Another way of doing this:
        String[] arr = a.split("[?,!,.]");
        System.out.println(arr.length);
    }
}
