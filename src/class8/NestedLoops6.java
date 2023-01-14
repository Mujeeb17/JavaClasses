package class8;

public class NestedLoops6 {
    public static void main(String[] args) {

        //print following sequence
        // 0 1 2 3 4 5
        // 0 2 4 6 8 10
        // 0 3 6 9 12 15
        for (int i = 0; i < 4; i++) {

            if (i == 0){
                continue;

            }
            for (int j = 0; j < 6; j++) {

                System.out.print(j * i + " ");
            }
            System.out.println();
        }
    }
}
