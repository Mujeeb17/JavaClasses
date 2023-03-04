package class31FileReadingAndWritingExcel;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileWriteDemo1 {
    public static void main(String[] args) throws IOException {

        //path where we want to create the new file and name of the file with its extension
        //(we want to create the file test.properties inside "Files" folder)
        String path = "Files/test.properties";

        //when we have to write data, we use FileOutputStream instead
        FileOutputStream fileOutputStream = new FileOutputStream(path);

        Properties p = new Properties();

        p.setProperty("Name", "Bobby");
        p.store(fileOutputStream, "A new name has been added");

        //WHEN WE RUN THIS CODE, WE CREATED THE FILE: test.properties inside the Files folder
        //if we re-run this code it will override the file
    }
}
