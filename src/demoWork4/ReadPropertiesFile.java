package demoWork4;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadPropertiesFile {
    public static void main(String[] args) throws IOException {

        Properties properties = new Properties();
        InputStream inputStream = new FileInputStream("src/demoWork4/confiq.properties");
        //1.if a class has abstract befor class name we cant't create object the traditional way.
        //2.try-catch block means :try this piece of code while you running those if you face any exception catch the
        // exception and store it as a variable here 'e' do whatever i want it to be doing.//e.printstacktrace
        //bacicall the path we put here to find any mistake the exception being used.///fillnotfoundexception
        //to find out we can print it insted (e.PrintStackTrace) of this we can say System.out.pl("whatevr i want).
        properties.load(inputStream);//load is a method.it loads data from the inputstream object.
        String dbNameFromFile = properties.getProperty("dbname");
        String dbUserFromFile = properties.getProperty("dbuser");
        String dbPasswordFromFile = properties.getProperty("dbpassword");
        System.out.println(dbNameFromFile);
        System.out.println(dbUserFromFile);
        System.out.println(dbPasswordFromFile);
    }

}
