/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KamusForm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Farkhan
 */
public class DbConnect {
    
    public static Connection getConnection(){

        try{
           // Class.forName("org.sqlite.JDBC");
            Connection  connection = DriverManager.getConnection("jdbc:mysql://sql12.freemysqlhosting.net/sql12343987","sql12343987","P5YcaEWi6X");
            return connection;

        }catch (Exception e){
            e.printStackTrace();
        }

        return null;
    }
    
    
}
