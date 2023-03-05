package class32ExceptionExcelProperties;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class ExcelFileDemo5 {
    public static void main(String[] args) throws IOException {

        String path = "Files/ExcelDemo5.xlsx";

        FileInputStream fileInputStream = new FileInputStream(path);

        XSSFWorkbook xssf = new XSSFWorkbook(fileInputStream);

        XSSFSheet s2 = xssf.getSheet("Sheet2");
        int nOfRows = s2.getPhysicalNumberOfRows();
        System.out.println(nOfRows);

        //storing the data from the excel file to a list of maps
        List<Map<String, String>> map = new ArrayList<>();

        for (int i = 1; i < nOfRows; i++) {
            Row row = s2.getRow(i);

            //creating one map for every row
            Map<String, String> data = new LinkedHashMap<>();

            //putting the values inside the map
            data.put("Username", row.getCell(0).toString());
            data.put("Password", row.getCell(1).toString());

            //adding the map to the list of maps
            map.add(data);
        }

        System.out.println(map);
    }
}
