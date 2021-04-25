package demoWork4;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadPropertiesFileutils { //same as properties file just show how reuse the code and read file data.
    //1.use the code from readpropertiesfile class
    //2.make them reuseble to read any files any data.
    //3.create a method which will take 2 params.
    //4.based on the key and file path ur method should return the value from properties file.


    public static String read(String filename, String key) throws IOException {
        Properties properties = new Properties();
        InputStream inputStream = new FileInputStream(filename);
        properties.load(inputStream);
        String value = properties.getProperty(key);
        return value;


    }

    public static void main(String[] args) throws IOException {
        String value = read("src/demoWork4/confiq.properties", "dbuser");
        System.out.println(value);


    }

}
