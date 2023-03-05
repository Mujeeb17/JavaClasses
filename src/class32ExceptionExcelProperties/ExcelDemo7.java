package class32ExceptionExcelProperties;

import utils.ExcelReader;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class ExcelDemo7 {
    public static void main(String[] args) throws IOException {

        //using the new method we created in the utils package to convert the
        //Excel data to a list of maps.
        List<Map<String, String>> excelData = ExcelReader.read("Files/ExcelFile1.xlsx", "Sheet1");

        //now we can print it out by accessing it in different ways
        System.out.println(excelData);

        for(Map<String, String> x: excelData){
            //use entrySet to iterate through the map
            for(Map.Entry<String, String> entry: x.entrySet()){
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
            System.out.println();
        }
        System.out.println(excelData.get(1).get("Salary"));
    }
}
