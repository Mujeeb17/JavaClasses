package class8;

public class Break {
    public static void main(String[] args) {

        //breaks will exit out the completely
        //continue would immediately start the next iteration of the loop
        for (int i = 0; i < 10; i++) {

            if (i == 3) {
                break;

            }
            System.out.println(i);
        }
    }
}
