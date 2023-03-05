package class32ExceptionExcelProperties;

public class ExceptionsDemo2 {
    public static void main(String[] args) {

        //this would give you red underline because its not under our control
        //we didn't create XSSFWorkbook, other developers did so java will
        //force you to write exception in the method signature or try catch block

//        ExcelReader.read("Files/ExcelFile1.xlsx", "Sheet1");
    }
}
