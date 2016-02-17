/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package JAVA_CLASSES;

import java.sql.*;

public class DBConfigurationManager 
{
    
    public static final String USER = "root";
    public static final String DRIVER = "com.mysql.jdbc.Driver";
    public static final String URL = "jdbc:mysql://localhost:3306/demo";
    public static final String PASSWORD = "root";
    
    static
    {
        try
        {
            Class.forName(DRIVER);
        }
        catch(Exception e)
        {
            
        }
    }
         
    public void createDBInstance(String username, String password)
    {
        try
        {            
            Connection conv=DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement ps=conv.prepareStatement("select * from customer");
            ResultSet rs = ps.executeQuery();
            if(rs.next())
            {
                System.out.print("WORKING FINE !!!");
            }
        }
        catch(Exception e1)
        {

        }
     
    }
    
}

