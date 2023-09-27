package fa.training.problem03.utils;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBC_Connection {
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:60/ebookshop";
    static final String USER ="root";
    static final String PASSWORD = "";
    public static Connection getConnection() {
        try {
            Class.forName(JDBC_DRIVER);
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);
            return conn;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
