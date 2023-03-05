package utils;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ExcelReader {

    public static List<Map<String, String>> read(String path, String sheetName) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(path);
        XSSFWorkbook xssf = new XSSFWorkbook(fileInputStream);
        XSSFSheet s2 = xssf.getSheet(sheetName);

        List<Map<String, String>> listOfMaps = new ArrayList<>();
        Row row0 = s2.getRow(0); // row with the type of info that is stored in the Excel file

        for (int i = 1; i < s2.getPhysicalNumberOfRows(); i++) {
            Row row = s2.getRow(i);

            //creating one map for every row
            Map<String, String> map = new LinkedHashMap<>();

            for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
                map.put(row0.getCell(j).toString(), row.getCell(j).toString());
            }
            listOfMaps.add(map);
        }
        return listOfMaps;
    }
}
