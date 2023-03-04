package class31FileReadingAndWritingExcel;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelReaderDemo1 {
    public static void main(String[] args) throws IOException {

        //location of file on the computer
        String path = "Files/ExcelFile1.xlsx";

        //we need fileInputStream because we are reading the data
        //navigating to the file
        FileInputStream fileInputStream = new FileInputStream(path);

        //now we need a software that can read and write data to an excel file
        XSSFWorkbook xssf = new XSSFWorkbook(fileInputStream);

        //we need to specify which sheet on the excel file that we want to read (sheets are like pages)
        Sheet sheet1 = xssf.getSheet("Sheet1");

        //now we have to go to the row of the sheet
        Row row = sheet1.getRow(1); // we are passing the index of the row we want
        //now getting the coloumn
        Cell cell = row.getCell(1);

        System.out.println(cell);

    }
}
