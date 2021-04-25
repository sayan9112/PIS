package Employee;

import java.sql.*;

public class conn{
    
    public Connection c;
    public Statement s;
 
    public conn(){
        try{
            Class.forName("oracle.jdbc.OracleDriver");  
            c =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","oracle");    
            s =c.createStatement();
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}
 
