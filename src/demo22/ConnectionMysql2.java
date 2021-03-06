package demo22;

import demoWork4.ReadPropertiesFileUtils;

import java.io.IOException;
import java.sql.*;
public class ConnectionMysql2 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
        String username = ReadPropertiesFileUtils.read("src/demo22/confiq.properties", "username");
        String password =ReadPropertiesFileUtils.read("src/demo22/confiq.properties","password");
        String dbname =ReadPropertiesFileUtils.read("src/demo22/confiq.properties","dbname ") ;
        String url ="jdbc:mysql://localhost:3306/" +dbname;//jdbc:mysql-driver name.//3306-portnum.localhost-hostn
        String query="select * from students;";
        Class.forName("com.mysql.cj.jdbc.Driver");//class name to connect sql//com.mysql.cj..from 8.0.24 extend
        Connection connection = DriverManager.getConnection(url ,username ,password);
        Statement statement = connection.createStatement();//this 3 line need to remember but they will pub-up anyway
        ResultSet table = statement.executeQuery(query);
        while (table.next()) { //while my table has next value.
            int idfromdb = table.getInt("id");
            String namefromdb=  table.getString("name");
            String statefromdb =   table.getString("state");
            String zipcodesfromdb=   table.getString("zipl");
            System.out.println(idfromdb +" "+namefromdb+" "+" "+statefromdb+" "+zipcodesfromdb);
        }
        System.out.println(dbname);
        statement.close();
        connection.close();
    }
}
