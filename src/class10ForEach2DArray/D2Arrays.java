package class10ForEach2DArray;

import java.util.Arrays;

public class D2Arrays {
    public static void main(String[] args) {

        //regular array
        String []bus0={"Adam","Zafar","Sam"};
        String []bus1={"Nabi","Saud","Anees"};
        String []bus2={"Safi","Abeera","Zahra"};

        //2d arrays can hold multiple individual arrays (like nested arrays)
        //first [] is rows, second [] is columns
        //like x and y axis on a graph
        //EX for using 2D arrays: if we have to store Excel files

        //a 2d array that can hold 3 one D arrays, each of size 3
        String [][]train= new String[3][3];

        //think of it like there is one train that has 3 buses and each bus can only fit 3 people
        train[0]=bus0;
        train[1]=bus1;
        train[2]=bus2;

        //will print whos in bus 1, seat #2: Anees
        System.out.println(train[1][2]);

        //will print Adam
        System.out.println(train[0][0]);

        //will print all of bus 0
        System.out.println(Arrays.toString(train[0]));
    }
}
