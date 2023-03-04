package class31FileReadingAndWritingExcel;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileWriteDemo2 {
    public static void main(String[] args) throws IOException {

        //practicing writing a file
        String path = "Files/test2.properties";

        FileOutputStream fileOutputStream = new FileOutputStream(path);

        Properties p = new Properties();

        p.setProperty("Mango", "3.99");
        p.setProperty("Banana", "2.99");
        p.setProperty("Apple", "2.50");
        p.store(fileOutputStream, "This is a list of fruits and its prices");
    }
}
