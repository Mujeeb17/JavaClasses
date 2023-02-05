package class18or19.homework;
/*
Write a Java program called Teacher.  Identify features and 4
behaviour of that Class. Create 3 subclasses MathTeacher,
ChemistryTeacher and PianoTeacher that would have it their
own features and behaviour. Test all 4 classes
 */
public class Teacher {
    String teacherName;
    String teacherId;

    public void homework() {
        System.out.println("Homeworks make students perfect!!!!");
    }

    public void grade() {
        System.out.println("Grade doesn't matter");
    }

    public void scholarship() {
        System.out.println("Good students from this class will get scholarship");
    }

    public void ExtraPoint() {
        System.out.println("All students attend the class will get extra point");
    }
}
class MathTeacher extends Teacher{
    String subject;
    String grade;

    void excellent(){
        System.out.println("This class is excellent");
    }
}

class ChemistryTeacher extends Teacher{
    String homework;
    String test;

    void science(){
        System.out.println("Chemistry class is fun");
    }
}

class Pianoteacher extends Teacher{
    String classic;
    String schedule;

    void happy(){
        System.out.println("This class make students happy");
    }
}
class TeacherTest {
    public static void main(String[] args) {
        Teacher tc=new Teacher();
        tc.teacherName="Babara";
        tc.teacherId="T121";

        System.out.println("This is principal "+tc.teacherName);
        tc.ExtraPoint();

        MathTeacher mt=new MathTeacher();
        mt.teacherName="Luna";
        mt.teacherId="M221";
        mt.subject="Math";
        System.out.println("Teacher "+mt.teacherName+" teach "+ mt.subject);
        mt.excellent();
        mt.homework();

        ChemistryTeacher ct=new ChemistryTeacher();
        ct.teacherName="Leonardo";
        ct.teacherId="C332";
        System.out.println("This class teach by "+ct.teacherName);
        ct.science();
        ct.homework();
        ct.scholarship();


        Pianoteacher pt=new Pianoteacher();
        pt.teacherName="Alice";
        pt.teacherId="P456";

        System.out.println("This class open for all grade teach by "+pt.teacherName);
        pt.happy();
        pt.grade();


    }
}