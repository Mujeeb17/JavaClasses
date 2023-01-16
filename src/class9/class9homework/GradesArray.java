package class9.class9homework;

/*
1) Create an array of chars and store grades into it: A,B,C,D,E,F.
Then print a grade B (use 2 different ways of creating an array).
 */
public class GradesArray {
    public static void main(String[] args) {

        char[] grades2 = new char[6];

        grades2[0]='A';
        grades2[1]='B';
        grades2[2]='C';
        grades2[3]='D';
        grades2[4]='E';
        grades2[5]='F';

        char[] grades1 = {'A', 'B', 'C', 'D', 'E', 'F'};

        System.out.println("grade " + grades1[1]);
    }
}
