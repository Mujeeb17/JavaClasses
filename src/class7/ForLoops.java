package class7;

public class ForLoops {
    public static void main(String[] args) {

        //we use for loops when we know exactly how many times we to loop through
        //a block of code, otherwise a while loop is good

        //prints number from 0 to 9
        int num = 1;
        while (num <=9){
            System.out.print(num);
            num++;
        }
        System.out.println("*******");
        //same program but in a for loop
        //(initialize; condition; increment Or decrement)
        for(int i =0; i<10; i++){
            System.out.println(i);
        }

        System.out.println("**********");
        //for loop printing odd numbers 1 to 20
        for(int i = 1; i < 20; i+=2){
            System.out.println(i);
        }
        System.out.println("*********");

        }
    }


