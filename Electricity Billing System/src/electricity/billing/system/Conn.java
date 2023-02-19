
package electricity.billing.system;
import java.sql.*;

public class Conn {
   
    Connection c;
    
    Conn(){
     c =   DriverManager.getConnection("jdbc:mysql://localhost:3306/");
    }
}
