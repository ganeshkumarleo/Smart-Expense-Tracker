import java.sql.Connection;
import java.sql.DriverManager;

public class Dbconnection {

    public static final String URL="jdbc:mysql://localhost:3306/expense_tracker";
    public static final String NAME="root";
    public static final String PASSWORD="1234";

public static Connection getConnection(){
        
        Connection conn = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            conn = DriverManager.getConnection(URL,NAME,PASSWORD);

            System.out.println("Database connected successfully");


        } catch (Exception e) {
            System.out.println("connection failed:"+e.getMessage());
        }
         return conn;
    }
}
   