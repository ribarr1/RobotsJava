package connection;
import java.sql.*;
public class ConnectionBuilder {
    static String username="system";
    static String password="pericos2";

    public static Connection buildConnection () {
        try{
           Class.forName("oracle.jdbc.driver.OracleDriver");
           try {
               return DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/ctifconex",username,password);
           } catch (SQLException e) {
               System.err.println("Problem in connection");
               e.printStackTrace();
                return null; // better throw an exception
           }
        } catch(ClassNotFoundException ex) {
            System.err.println("Error loading driver");
            return null; // better throw an exception
        }
    }
}


