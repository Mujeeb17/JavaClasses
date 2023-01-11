package class4;

public class NestIf3 {
    public static void main(String[] args) {

        boolean studyHard = true;
        int salary = 10000;

        if (studyHard) {

            System.out.println("I got the job");

            if (salary > 100000) {
                System.out.println("lets buy tesla");
            } else {
                System.out.println("lets buy toyota");
            }

        } else {
            System.out.println("It might take longer for you to get a job");
        }
    }
}
