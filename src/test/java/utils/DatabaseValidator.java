package utils;

import java.sql.*;

public class DatabaseValidator {

    public static ResultSet queryMySQL(String sql) throws Exception {
        Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/testdb","user","pass");
        return con.createStatement().executeQuery(sql);
    }

    public static ResultSet queryOracle(String sql) throws Exception {
        Connection con = DriverManager.getConnection(
            "jdbc:oracle:thin:@localhost:1521:xe","user","pass");
        return con.createStatement().executeQuery(sql);
    }
}
