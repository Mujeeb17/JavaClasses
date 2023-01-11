package class5;

public class LogicalOperators2 {
    public static void main(String[] args) {

        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || false);

        boolean boughtChoc = true;
        boolean boughtFlowers = true;
        if (boughtChoc||boughtFlowers) {
            System.out.println("good for you, self care");
        } else {
            System.out.println("treat yourself NOW");
        }

    }
}
