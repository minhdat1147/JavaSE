package JDBCWithSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseWithJDBC {
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:60/hello?useSSL=false";
    static final String USER = "root";
    static final String PASSWORD = "";

    private Connection connection;

    public DatabaseWithJDBC(){
        this.init();
    }

    public void init(){
        try{
            Class.forName(JDBC_DRIVER);
            System.out.println("Connecting to database...");
            connection = DriverManager.getConnection(DB_URL, USER, PASSWORD);
            System.out.println("Database connected!");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
    public Connection getConn(){
        return connection;
    }
    public void setConn(Connection conn){
        this.connection = conn;
    }
    public static void main(String[] args) {
        DatabaseWithJDBC jdbc = new DatabaseWithJDBC();
        Connection conn = jdbc.getConn();
        System.out.println(conn);
        if(conn == null) {
            System.out.println("Thất bại");
        }else {
            System.out.println("thành công");
        }
    }
//    public static Connection getConnection() {
//        final String url ="jdbc:mysql://localhost:60/hello?useSSL=false";
//        final String user = "root";
//        final String password ="";
//        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            try {
//                return DriverManager.getConnection(url, user,password);
//            }catch (SQLException e) {
//                // TODO: handle exception
//                e.printStackTrace();
//            }
//        }catch (ClassNotFoundException e) {
//            // TODO: handle exception
//            e.printStackTrace();
//        }
//        return null;
//    }
//    public static void main(String[] args) {
//        DatabaseWithJDBC jdbc = new DatabaseWithJDBC();
//        Connection conn = jdbc.getConnection();
//        System.out.println(conn);
//        if(conn == null) {
//            System.out.println("Thất bại");
//        }else {
//            System.out.println("Thành công");
//        }
//    }
}
