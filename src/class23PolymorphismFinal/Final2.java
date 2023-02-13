package class23PolymorphismFinal;

public class Final2 {

    final int y = 20;

    public static void main(String[] args) {

        final int x;
        x = 10;
        // x = 20; not possible because the variable is final

    }
    final void noOneShouldOverrideThis(){
        System.out.println("this method should never be overridden or else it might break the code base");
    }
    // this method is not able to be overridden in any child classes
}
class Final3 extends Final2{
    final int y = 10;

}
