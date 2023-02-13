package class3IfElseTypeCasting;

public class IfElse4 {
    public static void main(String[] args) {

        boolean hungry =true;

        //the '!' symbol will reverse the boolean value
        //since it is originally true, the ! symbol makes it false
        //so statement will not go through
        if (!hungry){
            System.out.println("lets eat");
        }

        boolean full = false;

        //reversing the statement using !
        if (!full) {
            System.out.println("dont eat anymore");
        }
    }
}
