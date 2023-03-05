package class32ExceptionExcelProperties;

import utils.ConfigReader;

import java.io.IOException;
import java.util.Properties;

public class ConfigReaderDemo {
    public static void main(String[] args) throws IOException {

        //using the method form our utils package to read the config.properties file
        Properties p = ConfigReader.read("Files/config.properties");

        System.out.println(p);
        System.out.println("password is: " + p.getProperty("password"));
    }
}
