package class13;

public class SplitDemo {
    public static void main(String[] args) {

        String str = "I like java. I write a lot of code daily. I am from batch 15";

        //we are creating an array of strings from 'str'
        //strArr[0] = I like java
        //str[1] = I write a lot of code daily
        //str[2] = I am from batch 15

        //splitting the string using the following grammar
        String [] strArr = str.split("[.?!]");
        System.out.println(strArr.length);
        //whenever we work with arrays, use length with without brackets
        //when working with Strings, use length()

        System.out.println(strArr[0]);
        System.out.println(strArr[1]); //what if i want to remove the space at beginning, use trim()
        System.out.println(strArr[1].trim());
    }
}
