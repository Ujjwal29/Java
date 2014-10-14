
package database_console;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class DBConnect {
    public static void main(String[] args) {
        
        try {
            String host = "jdbc:derby://localhost:1527/Employees";
            Connection con = DriverManager.getConnection(host, "root", "root");
            
            Statement stmt = con.createStatement();
            String SQL = "select * from WORKERS";
            ResultSet rs = stmt.executeQuery(SQL);
        
            
            while(rs.next())
            {
                int id_col = rs.getInt("ID");
                String first_name = rs.getString("First_Name");
                String last_name = rs.getString("Last_Name");
                String Job_title = rs.getString("Job_Title");
                System.out.println(id_col+" "+first_name+" "+last_name+" - "+Job_title);
            }
            } catch (SQLException err) {
            System.out.println(err.getMessage());
        }
        
    }
}
