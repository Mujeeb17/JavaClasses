package class6.class6homework;
/*
Create a boolean variable workDay and assign true create int variable day and assign it to 1
As long as it is workDay print “I need a day off” and increase day.
Once day is 6 print “I do not need a day off any more”
 */
public class WorkDays {
    public static void main(String[] args) {

        boolean workDay = true;
        int day = 1;

        while (workDay){
            System.out.println("I need a day off");

            if (day == 6){
                System.out.println("I do not need a day off any more");
                workDay = false;
            }
            day++;
        }

    }
}
