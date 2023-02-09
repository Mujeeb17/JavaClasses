package class15VariableTypesMethod.class15homework;
/*
6)Create  class Student that will have a method getGrade. Your method should accept the score of a student and return a grade:
score > 90 - A
score >80 - B
score >70 - C
score > 50 - D
anything else - F
 */
public class Student {

    public static void main(String[] args) {
        System.out.println(getGrade(82));
    }

    static char getGrade(int g){

        if (g > 90){
            return 'A';
        } else if (g > 80){
            return 'B';
        } else if (g > 70) {
            return 'C';
        } else if (g > 50){
            return 'D';
        }
        return 'F';
    }
}
