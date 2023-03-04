package class31FileReadingAndWritingExcel;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ExcelReadingDemo3 {
    public static void main(String[] args) throws IOException {

        String path = "Files/ExcelFile1.xlsx";
        FileInputStream fileInputStream = new FileInputStream(path);
        XSSFWorkbook xssf = new XSSFWorkbook(fileInputStream);
        XSSFSheet s1 = xssf.getSheet("Sheet1");

        //now we will store the excel file data in a map
        //see Demo4 for easier way

        LinkedHashMap<String, String> row1 = new LinkedHashMap<>();
        row1.put("name", "Hamid");
        row1.put("age", "30");
        row1.put("city", "San Ramon");
        row1.put("salary", "120000");

        LinkedHashMap<String, String> row2 = new LinkedHashMap<>();
        row2.put("name", "Sam");
        row2.put("age", "60");
        row2.put("city", "Houston");
        row2.put("salary", "125000");

        LinkedHashMap<String,String>row3=new LinkedHashMap<>();
        row3.put("name","Fayed");
        row3.put("age","48");
        row3.put("city","Alexandria");
        row3.put("salary","128000");

        //list of maps
        List<Map<String, String>> allRows = new ArrayList<>();
        allRows.add(row1);
        allRows.add(row2);
        allRows.add(row3);

        System.out.println(allRows);

    }
}
