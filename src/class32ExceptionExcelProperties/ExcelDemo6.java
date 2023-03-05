package class32ExceptionExcelProperties;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ExcelDemo6 {
    public static void main(String[] args) throws IOException {

        /*
        Same as previous demo but we automated putting
        values inside of the map
        note you can switch between every excel file
        by changing path and sheet name, and
        this code will work for it
        */
        String path = "Files/ExcelFile1.xlsx";

        FileInputStream fileInputStream = new FileInputStream(path);

        XSSFWorkbook xssf = new XSSFWorkbook(fileInputStream);

        XSSFSheet s2 = xssf.getSheet("Sheet1");
        int nOfRows = s2.getPhysicalNumberOfRows();
        System.out.println(nOfRows);

        //storing the data from the excel file to a list of maps
        List<Map<String, String>> listOfMaps = new ArrayList<>();


        Row row0 = s2.getRow(0); // the (| Username | Password |) row
        //instead of hard coding "Username" and "Password" like the last demo,
        //we can use the values inside this instead

        for (int i = 1; i < nOfRows; i++) {
            Row row = s2.getRow(i);

            //creating one map for every row
            Map<String, String> map = new LinkedHashMap<>();

            for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
                //row0 is the very first row with the type of info we are storing ("Username" & "Password")
                //so what ever
                map.put(row0.getCell(j).toString(), row.getCell(j).toString());
            }

            //adding the map to the list of maps
            listOfMaps.add(map);
        }

        System.out.println(listOfMaps);
    }
}
