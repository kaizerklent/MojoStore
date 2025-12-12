package javaapplication1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conn {

    public static Connection getConnection() {
        Connection con = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            String url = "jdbc:sqlserver://LAPTOP-0JCJOPL6\\SQLEXPRESS:1433;"
                       + "databaseName=MojoStore;"
                       + "user=sa;"
                       + "password=Kaizer12345;"
                       + "encrypt=true;"
                       + "trustServerCertificate=true;"
                    ;

            con = DriverManager.getConnection(url);

        } catch (ClassNotFoundException | SQLException ex) {
        }
        return con;
    }
}
