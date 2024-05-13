
package campuspluse;

import java.sql.*;
public class Conn {
     Connection c;
    Statement s;
     Conn() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql:///campuspluse", "root", "Bhaskar@0508");
            s = c.createStatement();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
