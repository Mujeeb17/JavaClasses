package class31FileReadingAndWritingExcel;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelReaderDemo2 {
    public static void main(String[] args) throws IOException {

        String path = "Files/ExcelFile1.xlsx";
        FileInputStream fileInputStream = new FileInputStream(path);
        XSSFWorkbook xssf = new XSSFWorkbook(fileInputStream);
        XSSFSheet s1 = xssf.getSheet("Sheet1");

        //this gets the amount of rows/columns in excel that actually have data
        int rowSize = s1.getPhysicalNumberOfRows();

        //now we will make a loop that will read all the data in the excel file
        //4 rows in the file
        for (int i = 0; i < rowSize; i++) {
            Row r = s1.getRow(i);

            //this method gives you the exact number of cells so you can use it
            //in the for loop condition
            int nOfCells = r.getPhysicalNumberOfCells();

            //a nested loop for the to actually print each cell
            //4 columns in the file
            for (int j = 0; j < nOfCells; j++) {
                Cell c = r.getCell(j);
                System.out.print(c + " | ");
            }
            System.out.println();

        }
    }
}
