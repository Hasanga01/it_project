
package itproject;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author User
 */
public class DBconnect {
 
    
    public static Connection connect (){
    
      Connection conn = null;
      
      
        try {
            
             //Class.forName("com.mysql.jdbc.Driver");
              //conn= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/mynewdb?useTimezone=true&serverTimezone=UTC", "root", "");
            
           Class.forName("com.mysql.jdbc.Driver");
           conn =   (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/mynewdb","root","");
            
        } catch (ClassNotFoundException | SQLException e) {
            
            System.out.println(e);
            System.out.println("Error");
        }
      
      
      return conn;
    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
