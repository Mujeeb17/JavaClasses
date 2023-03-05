package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    public static Properties read(String path) throws IOException {
        FileInputStream fileInputStream =new FileInputStream(path);
        Properties p = new Properties();
        p.load(fileInputStream);

        return p;
    }
}
