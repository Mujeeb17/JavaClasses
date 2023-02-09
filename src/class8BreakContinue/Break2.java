package class8BreakContinue;

public class Break2 {
    public static void main(String[] args) {

        boolean summer = true;

        int temp = 75;

        while (summer){
            if(temp <= 100){ //when temp is over 100, else will be executed
                System.out.println("I love summer because temperature is " + temp);

            } else { //when executed, temp will stop increasing because we 'break' the while loop

                System.out.println("its very hot because temperature is " + temp);
                break;
            }
            temp += 5;
        }
        System.out.println("**********");

        //task: write same program without a 'break'
        for (int t = 75; t <= 100; t+=5){
            System.out.println("I love summer because temperature is " + t);
        }
        System.out.println("I love summer because temperature is 105");

    }
}
