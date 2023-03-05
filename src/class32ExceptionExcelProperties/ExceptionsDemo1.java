package class32ExceptionExcelProperties;

public class ExceptionsDemo1 {
    public static void main(String[] args) {

        System.out.println("line1");
        System.out.println("line2");
        System.out.println("line3");
        System.out.println("line4");
        System.out.println("line5");
        System.out.println("line6");

        //if we didn't have the try catch code,
        //the 10/0 will cause a runtime error and stop
        //java doesn't force us (no red underline) to fix this code
        //because we are intentionally writing bad logic
        try{
            System.out.println(10/0);
        }catch (Exception e){
            System.out.println(e);
        }
        //the code continues to run because we have the try catch
        System.out.println("line7");
        System.out.println("line8");
        System.out.println("line9");
        System.out.println("line10");
    }
}
