package class6;

public class WhileLoops3 {
    public static void main(String[] args) {

        int num = 1;
        int sum = 0;

        while (num <= 10) {
            sum = sum + num;
            num++;
        }
        System.out.println(sum);
        System.out.println("****************");

        int num2 = 1;
        boolean flag = true;

        while(flag) {
            System.out.println(num2);
            if(num2 > 3) {
                flag = false;
            }
            num2 ++;
        }

        System.out.println("*************");

        boolean condition=true;
        int number=0;
        while (condition){
            System.out.println("Hello world");
            if(number>3){
                condition=false;
            }
            number++;

        }

    }
}
