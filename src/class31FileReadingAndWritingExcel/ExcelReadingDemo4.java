package class31FileReadingAndWritingExcel;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ExcelReadingDemo4 {
    public static void main(String[] args) throws IOException {

        String path = "Files/ExcelFile1.xlsx";
        FileInputStream fileInputStream = new FileInputStream(path);
        XSSFWorkbook xssf = new XSSFWorkbook(fileInputStream);
        XSSFSheet s1 = xssf.getSheet("Sheet1");

        int rowSize = s1.getPhysicalNumberOfRows();

        //now we are storing the dat from the excel file into a list of maps
        List<Map<String, String>> excelData = new ArrayList<>();

        for (int i = 1; i < rowSize; i++) {

            //this is iterating through each row
            Row r = s1.getRow(i);

            //we make a new map after every iteration (every row)
            LinkedHashMap rowMap = new LinkedHashMap<>();

            //we add all the data from those rows into the new map
            rowMap.put("Name", r.getCell(0));
            rowMap.put("Age", r.getCell(1));
            rowMap.put("City", r.getCell(2));
            rowMap.put("Salary", r.getCell(3));

            //we add this map to the list of maps and then loop starts over for next row
            excelData.add(rowMap);
        }
        System.out.println(excelData);
    }
}
