/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package delivery.management;

import java.sql.Connection;
import java.sql.DriverManager;
//import com.mysql.jdbc.Connection;
//import java.sql.DriverManager;
import static java.sql.DriverManager.getConnection;

/**
 *
 * @author asd
 */
public class DbConnect {
    
    public static Connection connect()
    {
        Connection conn = null;
        
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            conn = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/deliverymanagment","root","");
           
        }
        catch (Exception e)
        {
          System.out.println(e);
        }
        
     
        
         
        return conn;
    
    }
    
}
