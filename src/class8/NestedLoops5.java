package class8;

public class NestedLoops5 {
    public static void main(String[] args) {

        //print sequence:
        //0 1 2 3 4 5
        //1 2 3 4 5
        //2 3 4 5
        for (int i =0; i<3; i++){

            for (int j = i; j < 6; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
