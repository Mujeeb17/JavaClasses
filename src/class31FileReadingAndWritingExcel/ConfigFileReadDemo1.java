package class31FileReadingAndWritingExcel;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReadDemo1 {

    //this is after we have created the directory and the file config.properties

    public static void main(String[] args) throws IOException {

        String path = "Files/config.properties"; // value is from copying path reference option
                                                 // from right clicking config.properties

        //a class that helps us navigate to that folder where the file is stored
        FileInputStream fileInputStream =new FileInputStream(path);
        //you must add an exception to use this

        //this class will help us read and write data to .properties file
        Properties p = new Properties(); // also a child class of map

        //load all the data from the file inside above object
        p.load(fileInputStream);

        //should print all the values from config.properties file
        System.out.println(p.get("user"));
        System.out.println(p.get("password"));
        System.out.println(p.get("URL"));
        System.out.println(p.get("browser"));

        //using the close method once we are done using the file
        fileInputStream.close();
    }
}
